package com.paymaya.common.utility;

import k2.v0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: com.paymaya.common.utility.y, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class EnumC1235y {
    public static final b0 c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final EnumC1235y f11266d;
    public static final /* synthetic */ EnumC1235y[] e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f11267a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f11268b;

    static {
        EnumC1235y enumC1235y = new EnumC1235y("PAL", 0, "91058af6-0e04-4448-8c9a-07313c36cdac", true);
        f11266d = enumC1235y;
        EnumC1235y[] enumC1235yArr = {enumC1235y, new EnumC1235y("CARES", 1, "5a50cdf0-e530-41db-b5c5-f68af18ee0ac", false), new EnumC1235y("PBB", 2, "1a1d8920-bf36-4281-9543-0cafc458ea3c", false), new EnumC1235y("RAFFLE_GAMES", 3, "3a824535-fdd3-44b0-9b4b-cb5211551aa1", false)};
        e = enumC1235yArr;
        v0.h(enumC1235yArr);
        c = new b0();
    }

    public EnumC1235y(String str, int i, String str2, boolean z4) {
        this.f11267a = str2;
        this.f11268b = z4;
    }

    public static EnumC1235y valueOf(String str) {
        return (EnumC1235y) Enum.valueOf(EnumC1235y.class, str);
    }

    public static EnumC1235y[] values() {
        return (EnumC1235y[]) e.clone();
    }
}
