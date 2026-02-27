package com.appsflyer.internal;

import androidx.media3.exoplayer.upstream.CmcdData;
import java.util.HashMap;

/* JADX INFO: loaded from: classes2.dex */
public final class AFa1ySDK$26545$2 extends HashMap<String, String> {
    private /* synthetic */ Object AFInAppEventParameterName$2889b620;

    public AFa1ySDK$26545$2(Object obj) {
        this.AFInAppEventParameterName$2889b620 = obj;
        put("aa", "ro.arch");
        put("ab", "ro.chipname");
        put("ac", "ro.dalvik.vm.native.bridge");
        put("ad", "persist.sys.nativebridge");
        put("ae", "ro.enable.native.bridge.exec");
        put("af", "dalvik.vm.isa.x86.features");
        put("ag", "dalvik.vm.isa.x86.variant");
        put("ah", "ro.zygote");
        put("ai", "ro.allow.mock.location");
        put("aj", "ro.dalvik.vm.isa.arm");
        put("ak", "dalvik.vm.isa.arm.features");
        put("al", "dalvik.vm.isa.arm.variant");
        put("am", "dalvik.vm.isa.arm64.features");
        put("an", "dalvik.vm.isa.arm64.variant");
        put("ao", "vzw.os.rooted");
        put("ap", "ro.build.user");
        put("aq", "ro.kernel.qemu");
        put("ar", "ro.hardware");
        put("as", "ro.product.cpu.abi");
        put("at", "ro.product.cpu.abilist");
        put("au", "ro.product.cpu.abilist32");
        put(CmcdData.Factory.OBJECT_TYPE_MUXED_AUDIO_AND_VIDEO, "ro.product.cpu.abilist64");
    }
}
