package c5;

import We.s;
import com.google.android.gms.common.internal.ImagesContract;
import com.tencent.youtu.sdkkitframework.common.StateEvent;
import java.util.Iterator;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.j;
import org.json.JSONException;
import org.json.JSONObject;
import s5.InterfaceC2237a;
import s5.i;

/* JADX INFO: renamed from: c5.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1075a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f9287a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final InterfaceC2237a f9288b;
    public final String c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f9289d;
    public final i e;
    public final Integer f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f9290g;
    public final String h;
    public final String i;
    public final String j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final String f9291k;

    public C1075a(String adIdentifier, InterfaceC2237a placement, String str, String str2, i iVar, Integer num, String str3, String str4, String str5, String str6, String str7, int i) {
        str = (i & 4) != 0 ? null : str;
        str2 = (i & 8) != 0 ? null : str2;
        iVar = (i & 16) != 0 ? null : iVar;
        num = (i & 32) != 0 ? null : num;
        str3 = (i & 64) != 0 ? null : str3;
        str4 = (i & 128) != 0 ? null : str4;
        str5 = (i & 256) != 0 ? null : str5;
        str6 = (i & 512) != 0 ? null : str6;
        str7 = (i & 1024) != 0 ? null : str7;
        j.g(adIdentifier, "adIdentifier");
        j.g(placement, "placement");
        this.f9287a = adIdentifier;
        this.f9288b = placement;
        this.c = str;
        this.f9289d = str2;
        this.e = iVar;
        this.f = num;
        this.f9290g = str3;
        this.h = str4;
        this.i = str5;
        this.j = str6;
        this.f9291k = str7;
    }

    public final LinkedHashMap a() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("os", "android");
        String str = this.f9287a;
        if (str.length() > 0) {
            jSONObject.put("ad_identifier", str);
        }
        jSONObject.put("placement", this.f9288b.toString());
        String str2 = this.c;
        if (str2 != null && str2.length() > 0) {
            jSONObject.put("creative_name", str2);
        }
        String str3 = this.f9289d;
        if (str3 != null && str3.length() > 0) {
            jSONObject.put(ImagesContract.URL, str3);
        }
        i iVar = this.e;
        if (iVar != null) {
            jSONObject.put("redirectionType", iVar.f20019a);
        }
        Integer num = this.f;
        if (num != null) {
            jSONObject.put(StateEvent.Name.ERROR_CODE, num.toString());
        }
        String str4 = this.f9290g;
        if (str4 != null) {
            jSONObject.put("error_description", str4.toString());
        }
        String str5 = this.h;
        if (str5 != null) {
            jSONObject.put("error_reason", str5.toString());
        }
        String str6 = this.i;
        if (str6 != null) {
            jSONObject.put("duration", str6.toString());
        }
        String str7 = this.j;
        if (str7 != null) {
            jSONObject.put("button", str7);
        }
        String str8 = this.f9291k;
        if (str8 != null) {
            jSONObject.put("direction", str8);
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator<String> itKeys = jSONObject.keys();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            try {
                try {
                    linkedHashMap.put(next, jSONObject.getString(next));
                } catch (JSONException e) {
                    System.out.println((Object) s.k("Error retrieving value for key '", next, "' even as generic Object: ", e.getMessage()));
                }
            } catch (JSONException unused) {
                linkedHashMap.put(next, jSONObject.get(next).toString());
            }
        }
        return linkedHashMap;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1075a)) {
            return false;
        }
        C1075a c1075a = (C1075a) obj;
        return j.b(this.f9287a, c1075a.f9287a) && j.b(this.f9288b, c1075a.f9288b) && j.b(this.c, c1075a.c) && j.b(this.f9289d, c1075a.f9289d) && this.e == c1075a.e && j.b(this.f, c1075a.f) && j.b(this.f9290g, c1075a.f9290g) && j.b(this.h, c1075a.h) && j.b(this.i, c1075a.i) && j.b(this.j, c1075a.j) && j.b(this.f9291k, c1075a.f9291k);
    }

    public final int hashCode() {
        int iHashCode = (this.f9288b.hashCode() + (this.f9287a.hashCode() * 31)) * 31;
        String str = this.c;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f9289d;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        i iVar = this.e;
        int iHashCode4 = (iHashCode3 + (iVar == null ? 0 : iVar.hashCode())) * 31;
        Integer num = this.f;
        int iHashCode5 = (iHashCode4 + (num == null ? 0 : num.hashCode())) * 31;
        String str3 = this.f9290g;
        int iHashCode6 = (iHashCode5 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.h;
        int iHashCode7 = (iHashCode6 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.i;
        int iHashCode8 = (iHashCode7 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.j;
        int iHashCode9 = (iHashCode8 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.f9291k;
        return iHashCode9 + (str7 != null ? str7.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("AdKitAnalyticsAttributes(adIdentifier=");
        sb2.append(this.f9287a);
        sb2.append(", placement=");
        sb2.append(this.f9288b);
        sb2.append(", creativeName=");
        sb2.append(this.c);
        sb2.append(", url=");
        sb2.append(this.f9289d);
        sb2.append(", redirectionType=");
        sb2.append(this.e);
        sb2.append(", errorCode=");
        sb2.append(this.f);
        sb2.append(", errorDescription=");
        sb2.append(this.f9290g);
        sb2.append(", errorReason=");
        sb2.append(this.h);
        sb2.append(", duration=");
        sb2.append(this.i);
        sb2.append(", button=");
        sb2.append(this.j);
        sb2.append(", direction=");
        return s.p(sb2, this.f9291k, ")");
    }
}
