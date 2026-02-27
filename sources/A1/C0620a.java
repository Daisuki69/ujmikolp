package a1;

import Xh.i;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.regex.Pattern;

/* JADX INFO: renamed from: a1.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C0620a {
    public static final String c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final Set f6974d;
    public static final C0620a e;
    public static final C0620a f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f6975a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f6976b;

    static {
        String strY = i.y("hts/frbslgiggolai.o/0clgbthfra=snpoo", "tp:/ieaeogn.ogepscmvc/o/ac?omtjo_rt3");
        c = strY;
        String strY2 = i.y("hts/frbslgigp.ogepscmv/ieo/eaybtho", "tp:/ieaeogn-agolai.o/1frlglgc/aclg");
        String strY3 = i.y("AzSCki82AwsLzKd5O8zo", "IayckHiZRO1EFl1aGoK");
        f6974d = Collections.unmodifiableSet(new HashSet(Arrays.asList(new Z0.c("proto"), new Z0.c("json"))));
        e = new C0620a(strY, null);
        f = new C0620a(strY2, strY3);
    }

    public C0620a(String str, String str2) {
        this.f6975a = str;
        this.f6976b = str2;
    }

    public static C0620a a(byte[] bArr) {
        String str = new String(bArr, Charset.forName("UTF-8"));
        if (!str.startsWith("1$")) {
            throw new IllegalArgumentException("Version marker missing from extras");
        }
        String[] strArrSplit = str.substring(2).split(Pattern.quote("\\"), 2);
        if (strArrSplit.length != 2) {
            throw new IllegalArgumentException("Extra is not a valid encoded LegacyFlgDestination");
        }
        String str2 = strArrSplit[0];
        if (str2.isEmpty()) {
            throw new IllegalArgumentException("Missing endpoint in CCTDestination extras");
        }
        String str3 = strArrSplit[1];
        if (str3.isEmpty()) {
            str3 = null;
        }
        return new C0620a(str2, str3);
    }
}
