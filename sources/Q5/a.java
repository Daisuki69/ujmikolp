package Q5;

import com.google.gson.m;
import com.google.gson.n;
import com.google.gson.o;
import com.paymaya.domain.model.MaintenanceDynamicConfig;
import com.paymaya.domain.model.ScreensBannerIndex;
import com.paymaya.domain.model.UpdaterConfigDetails;
import com.paymaya.domain.model.flagconfig.DashboardContentConfigDetails;
import com.paymaya.domain.model.flagconfig.DashboardTabConfig;
import java.lang.reflect.Type;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class a implements n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5260a;

    public /* synthetic */ a(int i) {
        this.f5260a = i;
    }

    @Override // com.google.gson.n
    public final Object deserialize(o oVar, Type type, m mVar) {
        switch (this.f5260a) {
            case 0:
                return DashboardContentConfigDetails.deserializer$lambda$1(oVar, type, mVar);
            case 1:
                return DashboardTabConfig.deserializer$lambda$2(oVar, type, mVar);
            case 2:
                return MaintenanceDynamicConfig.deserializer$lambda$2(oVar, type, mVar);
            case 3:
                return ScreensBannerIndex.deserializer$lambda$0(oVar, type, mVar);
            default:
                return UpdaterConfigDetails.deserializer$lambda$3(oVar, type, mVar);
        }
    }
}
