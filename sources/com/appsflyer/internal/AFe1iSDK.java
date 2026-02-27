package com.appsflyer.internal;

import android.content.Context;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes2.dex */
public abstract class AFe1iSDK extends AFa1tSDK {
    private final boolean AFLogger$LogLevel;
    public boolean afWarnLog;
    private final boolean getLevel;

    public AFe1iSDK() {
        this(null, null, null, null, null, null);
    }

    public final boolean AFVersionDeclaration() {
        return this.afWarnLog;
    }

    public final boolean afErrorLogForExcManagerOnly() {
        return this.getLevel;
    }

    public final boolean afWarnLog() {
        return this.AFLogger$LogLevel;
    }

    public AFe1iSDK(@Nullable String str, @Nullable String str2, @Nullable Boolean bool, @Nullable Boolean bool2, @Nullable Boolean bool3, @Nullable Context context) {
        super(str, str2, Boolean.valueOf(bool3 != null ? bool3.booleanValue() : false), context);
        this.AFLogger$LogLevel = bool != null ? bool.booleanValue() : true;
        this.getLevel = bool2 != null ? bool2.booleanValue() : true;
    }
}
