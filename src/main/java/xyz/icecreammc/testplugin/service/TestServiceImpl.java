package xyz.icecreammc.testplugin.service;

import xyz.icecreammc.testplugin.TestPlugin;

public class TestServiceImpl implements TestService {
    private final TestPlugin plugin;

    public TestServiceImpl(TestPlugin plugin) {
        this.plugin = plugin;
    }

    @Override
    public void helloWorld() {
        this.plugin.getLogger().info("Hello, World! Services work");
    }
}
