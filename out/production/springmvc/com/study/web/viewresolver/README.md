# 自定义视图小结：
1. 自定义视图：创建一个View的bean，该bean需要继承AbstractView，并实现renderMergedOutputModel方法
2. 并把自定义视图添加IOC容器中
3. 自定义视图的视图处理器配置使用BeanNameViewResolver，这个处理器也需要配置到IOC容器中
4. BeanNameViewResolver的调用优先级调整，设置order，默认都是Integer.MAX_VALUE  order的数值越大，优先级越小


# 自定义视图-工作流程
1. SpringMVC调用目标方法，返回自定义View在IOC容器中的id(就是返回视图在容器中的id名字)
2. SpringMVC调用BeanNameViewResolver解析视图：通过从IOC容器中拿到的自定义视图的id名字，得到该id名字对应的Bean(就是自定义的View视图对象)
3. SpringMVC调用自定义视图(View)的renderMergedOutputModel方法渲染视图
4. 如果SringMVC调用目标方法，该方法返回的视图名称在IOC容器中不存在，则仍然按照默认的视图处理器机制处理，再没找到，则抛出异常