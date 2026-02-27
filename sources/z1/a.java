package Z1;

import O1.AbstractC0505d0;
import O1.AbstractC0529x;
import O1.O;
import O1.P;
import O1.S;
import O1.t0;
import android.os.Bundle;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.google.android.gms.measurement.AppMeasurement;
import com.google.android.gms.measurement.internal.zzjo;

/* JADX INFO: loaded from: classes2.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final AbstractC0505d0 f6877a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final t0 f6878b;
    public static final t0 c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final t0 f6879d;
    public static final t0 e;
    public static final t0 f;

    static {
        int i = AbstractC0505d0.c;
        Object[] objArr = new Object[15];
        objArr[0] = "_in";
        objArr[1] = "_xa";
        objArr[2] = "_xu";
        objArr[3] = "_aq";
        objArr[4] = "_aa";
        objArr[5] = "_ai";
        System.arraycopy(new String[]{"_ac", "campaign_details", "_ug", "_iapx", "_exp_set", "_exp_clear", "_exp_activate", "_exp_timeout", "_exp_expire"}, 0, objArr, 6, 9);
        f6877a = AbstractC0505d0.j(15, objArr);
        P p10 = S.f4555b;
        Object[] objArr2 = {"_e", "_f", "_iap", "_s", "_au", "_ui", "_cd"};
        AbstractC0529x.b(7, objArr2);
        f6878b = S.i(7, objArr2);
        c = S.s(TtmlNode.TEXT_EMPHASIS_AUTO, "app", "am");
        f6879d = S.q("_r", "_dbg");
        O o8 = new O(4);
        o8.b(zzjo.zza);
        o8.b(zzjo.zzb);
        e = o8.g();
        f = S.q("^_ltv_[A-Z]{3}$", "^_cc[1-5]{1}$");
    }

    public static boolean a(String str) {
        return !c.contains(str);
    }

    public static boolean b(Bundle bundle, String str) {
        if (!f6878b.contains(str)) {
            if (bundle == null) {
                return true;
            }
            t0 t0Var = f6879d;
            int i = t0Var.f4608d;
            int i4 = 0;
            while (i4 < i) {
                boolean zContainsKey = bundle.containsKey((String) t0Var.get(i4));
                i4++;
                if (zContainsKey) {
                }
            }
            return true;
        }
        return false;
    }

    public static boolean c(String str, String str2) {
        if ("_ce1".equals(str2) || "_ce2".equals(str2)) {
            if (str.equals(AppMeasurement.FCM_ORIGIN) || str.equals("frc")) {
                return true;
            }
        } else if ("_ln".equals(str2)) {
            if (str.equals(AppMeasurement.FCM_ORIGIN) || str.equals(AppMeasurement.FIAM_ORIGIN)) {
                return true;
            }
        } else if (!e.contains(str2)) {
            t0 t0Var = f;
            int i = t0Var.f4608d;
            int i4 = 0;
            while (i4 < i) {
                boolean zMatches = str2.matches((String) t0Var.get(i4));
                i4++;
                if (zMatches) {
                }
            }
            return true;
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0074  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean d(java.lang.String r5, java.lang.String r6, android.os.Bundle r7) {
        /*
            java.lang.String r0 = "_cmp"
            boolean r6 = r0.equals(r6)
            r0 = 1
            if (r6 != 0) goto La
            return r0
        La:
            boolean r6 = a(r5)
            r1 = 0
            if (r6 != 0) goto L12
            goto L67
        L12:
            if (r7 != 0) goto L15
            goto L67
        L15:
            O1.t0 r6 = Z1.a.f6879d
            int r2 = r6.f4608d
            r3 = r1
        L1a:
            if (r3 >= r2) goto L2b
            java.lang.Object r4 = r6.get(r3)
            java.lang.String r4 = (java.lang.String) r4
            boolean r4 = r7.containsKey(r4)
            int r3 = r3 + 1
            if (r4 == 0) goto L1a
            goto L67
        L2b:
            int r6 = r5.hashCode()
            r2 = 101200(0x18b50, float:1.41811E-40)
            r3 = 2
            if (r6 == r2) goto L54
            r2 = 101230(0x18b6e, float:1.41853E-40)
            if (r6 == r2) goto L4a
            r2 = 3142703(0x2ff42f, float:4.403865E-39)
            if (r6 == r2) goto L40
            goto L5e
        L40:
            java.lang.String r6 = "fiam"
            boolean r5 = r5.equals(r6)
            if (r5 == 0) goto L5e
            r5 = r3
            goto L5f
        L4a:
            java.lang.String r6 = "fdl"
            boolean r5 = r5.equals(r6)
            if (r5 == 0) goto L5e
            r5 = r0
            goto L5f
        L54:
            java.lang.String r6 = "fcm"
            boolean r5 = r5.equals(r6)
            if (r5 == 0) goto L5e
            r5 = r1
            goto L5f
        L5e:
            r5 = -1
        L5f:
            java.lang.String r6 = "_cis"
            if (r5 == 0) goto L74
            if (r5 == r0) goto L6e
            if (r5 == r3) goto L68
        L67:
            return r1
        L68:
            java.lang.String r5 = "fiam_integration"
            r7.putString(r6, r5)
            return r0
        L6e:
            java.lang.String r5 = "fdl_integration"
            r7.putString(r6, r5)
            return r0
        L74:
            java.lang.String r5 = "fcm_integration"
            r7.putString(r6, r5)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: Z1.a.d(java.lang.String, java.lang.String, android.os.Bundle):boolean");
    }
}
