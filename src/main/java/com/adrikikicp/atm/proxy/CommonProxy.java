package com.adrikikicp.atm.proxy;


import net.minecraft.item.Item;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.message.MessageFactory;
import scala.swing.Dialog;

import javax.xml.soap.SOAPException;

public class CommonProxy  {

    public void create() {

        LogManager.getLogger().info("IProxyRegistryEntry loaded");
    }

    public void registerModel(Item item, int metadata) {}
}
