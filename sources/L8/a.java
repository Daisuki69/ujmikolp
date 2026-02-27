package L8;

import androidx.fragment.app.Fragment;
import com.paymaya.common.utility.C1219h;
import com.paymaya.common.utility.EnumC1212a;
import com.paymaya.mayaui.kyczoloz.view.activity.impl.MayaKycActivity;
import java.util.Map;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class a implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2851a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Fragment f2852b;
    public final /* synthetic */ Map c;

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ a(c cVar, Map map, int i) {
        this.f2851a = i;
        this.f2852b = (Fragment) cVar;
        this.c = map;
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [L8.c, androidx.fragment.app.Fragment] */
    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        Map map = this.c;
        ?? r32 = this.f2852b;
        switch (this.f2851a) {
            case 0:
                C1219h c1219hH = ((MayaKycActivity) r32.Q()).H();
                if (r32.D()) {
                    EnumC1212a enumC1212a = EnumC1212a.ACCOUNT_NUMBER;
                    c1219hH.j.put("path", "TOFU 1.0");
                }
                for (Map.Entry entry : map.entrySet()) {
                    c1219hH.f((EnumC1212a) entry.getKey(), (String) entry.getValue());
                }
                return c1219hH;
            case 1:
                C1219h c1219hW1 = ((MayaKycActivity) r32.Q()).W1();
                EnumC1212a enumC1212a2 = EnumC1212a.ACCOUNT_NUMBER;
                c1219hW1.j.put("path", "TOFU 1.0");
                for (Map.Entry entry2 : map.entrySet()) {
                    c1219hW1.f((EnumC1212a) entry2.getKey(), (String) entry2.getValue());
                }
                return c1219hW1;
            case 2:
                C1219h c1219hW12 = ((MayaKycActivity) r32.Q()).W1();
                EnumC1212a enumC1212a3 = EnumC1212a.ACCOUNT_NUMBER;
                c1219hW12.j.put("path", "TOFU 1.0");
                for (Map.Entry entry3 : map.entrySet()) {
                    c1219hW12.f((EnumC1212a) entry3.getKey(), (String) entry3.getValue());
                }
                return c1219hW12;
            case 3:
                C1219h c1219hW13 = ((MayaKycActivity) r32.Q()).W1();
                EnumC1212a enumC1212a4 = EnumC1212a.ACCOUNT_NUMBER;
                c1219hW13.j.put("path", "TOFU 1.0");
                for (Map.Entry entry4 : map.entrySet()) {
                    c1219hW13.f((EnumC1212a) entry4.getKey(), (String) entry4.getValue());
                }
                return c1219hW13;
            case 4:
                C1219h c1219hW14 = ((MayaKycActivity) r32.Q()).W1();
                EnumC1212a enumC1212a5 = EnumC1212a.ACCOUNT_NUMBER;
                c1219hW14.j.put("path", "TOFU 1.0");
                for (Map.Entry entry5 : map.entrySet()) {
                    c1219hW14.f((EnumC1212a) entry5.getKey(), (String) entry5.getValue());
                }
                return c1219hW14;
            default:
                C1219h c1219hH2 = ((MayaKycActivity) r32.Q()).H();
                if (r32.D()) {
                    EnumC1212a enumC1212a6 = EnumC1212a.ACCOUNT_NUMBER;
                    c1219hH2.j.put("path", "TOFU 1.0");
                }
                for (Map.Entry entry6 : map.entrySet()) {
                    c1219hH2.f((EnumC1212a) entry6.getKey(), (String) entry6.getValue());
                }
                return c1219hH2;
        }
    }
}
