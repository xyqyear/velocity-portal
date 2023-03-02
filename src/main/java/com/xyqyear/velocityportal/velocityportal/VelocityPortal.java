package com.xyqyear.velocityportal.velocityportal;

import com.google.inject.Inject;
import com.velocitypowered.api.event.proxy.ProxyInitializeEvent;
import com.velocitypowered.api.event.Subscribe;
import com.velocitypowered.api.plugin.Plugin;
import org.slf4j.Logger;

@Plugin(
        id = "velocity-portal",
        name = "Velocity Portal",
        version = "0.0.1"
)
public class VelocityPortal {

    @Inject
    private Logger logger;

    @Subscribe
    public void onProxyInitialization(ProxyInitializeEvent event) {
        logger.info("Hello Velocity world!");
    }
}
