package com.dynatrace.agent.metrics;

import Rg.g;
import android.content.Context;
import com.dynatrace.agent.common.connectivity.LocalBuild;
import com.dynatrace.agent.common.connectivity.NetworkConnectivityChecker;
import com.dynatrace.agent.events.enrichment.NetworkTypeExtensionsKt;
import com.dynatrace.agent.util.RootDetector;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes2.dex */
public final class OneAgentMetricsProvider {
    private final Context applicationContext;
    private final Function1<Context, Boolean> isDeviceRooted;
    private final String manufacturer;
    private final String model;
    private final NetworkConnectivityChecker networkConnectivityChecker;
    private final String osVersion;

    /* JADX WARN: Multi-variable type inference failed */
    public OneAgentMetricsProvider(NetworkConnectivityChecker networkConnectivityChecker, Context applicationContext, Function1<? super Context, Boolean> isDeviceRooted) {
        j.g(networkConnectivityChecker, "networkConnectivityChecker");
        j.g(applicationContext, "applicationContext");
        j.g(isDeviceRooted, "isDeviceRooted");
        this.networkConnectivityChecker = networkConnectivityChecker;
        this.applicationContext = applicationContext;
        this.isDeviceRooted = isDeviceRooted;
        LocalBuild localBuild = LocalBuild.INSTANCE;
        this.manufacturer = localBuild.getManufacturer();
        this.model = localBuild.getModel();
        this.osVersion = localBuild.getOs();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean _init_$lambda$0(Context it) {
        j.g(it, "it");
        return RootDetector.INSTANCE.isDeviceRooted(it);
    }

    public final int deviceOrientation() {
        return this.applicationContext.getResources().getConfiguration().orientation;
    }

    public final String getManufacturer() {
        return this.manufacturer;
    }

    public final String getModel() {
        return this.model;
    }

    public final String getOsVersion() {
        return this.osVersion;
    }

    public final boolean isDeviceRooted() {
        return ((Boolean) this.isDeviceRooted.invoke(this.applicationContext)).booleanValue();
    }

    public final String networkState() {
        return NetworkTypeExtensionsKt.getStringRepresentation(this.networkConnectivityChecker.currentNetworkState().getNetworkType());
    }

    public final String packageName() {
        String packageName = this.applicationContext.getPackageName();
        j.f(packageName, "getPackageName(...)");
        return packageName;
    }

    public /* synthetic */ OneAgentMetricsProvider(NetworkConnectivityChecker networkConnectivityChecker, Context context, Function1 function1, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(networkConnectivityChecker, context, (i & 4) != 0 ? new g(26) : function1);
    }
}
