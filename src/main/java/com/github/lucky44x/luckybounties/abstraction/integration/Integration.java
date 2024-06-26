package com.github.lucky44x.luckybounties.abstraction.integration;

import com.github.lucky44x.luckybounties.LuckyBounties;
import com.github.lucky44x.luckybounties.abstraction.integration.exception.IntegrationException;

/**
 * @author Lucky44x
 * Integration base class to easily extend luckybounties functionality
 */
public abstract class Integration {

    protected final LuckyBounties instance;

    public Integration(LuckyBounties instance){
        this.instance = instance;
    }

    public abstract void onEnable() throws IntegrationException;

    public abstract void onDisable() throws IntegrationException;
}
