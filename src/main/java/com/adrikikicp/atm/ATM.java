package com.adrikikicp.atm;

import com.adrikikicp.atm.proxy.CommonProxy;
import com.adrikikicp.atm.util.Reference;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.relauncher.FMLLaunchHandler;
import org.spongepowered.asm.launch.MixinBootstrap;
/*
 Copyright 2022 Adrikikicp

   Licensed under the Apache License, Version 2.0 (the "License");
   you may not use this file except in compliance with the License.
   You may obtain a copy of the License at

       http://www.apache.org/licenses/LICENSE-2.0

   Unless required by applicable law or agreed to in writing, software
   distributed under the License is distributed on an "AS IS" BASIS,
   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
   See the License for the specific language governing permissions and
   limitations under the License.
 */
@Mod(modid="atm")
public class ATM {

    @Mod.Instance
    public static ATM instance;

    @SidedProxy(clientSide = Reference.CLIENT, serverSide = Reference.SERVER)
    public static CommonProxy proxy;

public ATM(){

}



}
