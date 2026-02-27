package com.paymaya.common.utility;

import com.dynatrace.android.agent.Global;
import com.google.android.gms.internal.ads.AbstractC1173g;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: com.paymaya.common.utility.w, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC1233w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final List f11233a = Collections.unmodifiableList(Arrays.asList("Mobile", "Gaming", "Others"));

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final List f11234b = Collections.unmodifiableList(Arrays.asList("type1", "type2", "type3", "type4"));
    public static final List c = Collections.unmodifiableList(Arrays.asList("Religious Org Member (e.g. Priest, Pastor)", "Housewife/Househusband/Dependent", "Retiree", "Freelance (e.g. Writer, Buy & Sell)", "Student", "Others"));

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final List f11235d = Collections.unmodifiableList(Arrays.asList("Retiree", "Students", "Housewife/Househusband/Dependent", "Freelance (e.g Writer, Buy and Sell)", "Other/s, please specify"));
    public static final List e = Collections.unmodifiableList(Arrays.asList("NBI_CLEARANCE", "PASSPORT"));
    public static final List f = Collections.unmodifiableList(Arrays.asList("All", "MBILL", "PWPBILLSPAY"));

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final List f11236g = Collections.unmodifiableList(Arrays.asList("All", "MBILLR", "PWPBILLSPAYREV"));
    public static final List h = Collections.unmodifiableList(Arrays.asList("All", "Promos", "Updates"));
    public static final List i = Collections.unmodifiableList(Arrays.asList("merchantrewards", "luckygames", "insurance", "paylater", "stocks"));
    public static final String j = "SHOP_" + EnumC1216e.HOME + Global.UNDERSCORE + AbstractC1173g.G(2);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final String f11237k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final String f11238l;
    public static final String m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final String f11239n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final String f11240o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final String f11241p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final Integer f11242q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final Integer f11243r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final List f11244s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final Integer f11245t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final Integer f11246u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final Long f11247v;

    static {
        EnumC1215d.PAY_BILLS.toString();
        f11237k = "CASH_IN_APPEAR";
        f11238l = "CREATOR_STORE_BANNER_APPEAR";
        m = "CREATOR_STORE_BANNER_V2_APPEAR";
        f11239n = "CREATOR_STORE_INTERSTITIAL_APPEAR";
        f11240o = "RECEIPT_APPEAR";
        f11241p = "SERVICES_BANNER_APPEAR";
        f11242q = 10;
        f11243r = 15;
        f11244s = Collections.unmodifiableList(Arrays.asList("mycards", "banktransfer", "invest", "lrt1", "bills", "load", "voucher", "missions"));
        f11245t = 6;
        f11246u = 6;
        f11247v = Long.valueOf(androidx.media3.common.C.DEFAULT_SEEK_FORWARD_INCREMENT_MS);
    }
}
