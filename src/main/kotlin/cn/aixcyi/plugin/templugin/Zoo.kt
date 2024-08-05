package cn.aixcyi.plugin.templugin

@Suppress("unused")
object Zoo {
    /**
     * 插件配置的全局存储位置。
     */
    const val PLUGIN_STORAGE = "HooTool.xml"

    /**
     * 国际化文本包路径。
     *
     * 对应 `./src/kotlin/resources/messages/PluginTemplate.properties`
     */
    const val BUNDLE_NAME = "messages.PluginTemplate"

    /**
     * 插件配置所对应的 XML 的组件名。
     *
     * `<component name="NAME"></component>`
     */
    object XmlComponent {
        // const val OPTIONS = "MyOptions"
    }
}