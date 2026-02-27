package A5;

import cj.L;
import com.paymaya.common.utility.EnumC1217f;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class h implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f166a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ m f167b;
    public final /* synthetic */ Map c;

    public /* synthetic */ h(m mVar, Map map, int i) {
        this.f166a = i;
        this.f167b = mVar;
        this.c = map;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f166a) {
            case 0:
                m mVar = this.f167b;
                mVar.d().c("split_sdk_ready", L.c(new Pair("traffic_type", "anonymous")));
                mVar.d().f("split_sdk_ready");
                mVar.f(EnumC1217f.CLIENT_READY, this.c);
                if (mVar.f) {
                    mVar.f = false;
                }
                break;
            case 1:
                m mVar2 = this.f167b;
                mVar2.d().c("split_sdk_ready_cache", L.c(new Pair("traffic_type", "anonymous")));
                mVar2.d().f("split_sdk_ready_cache");
                mVar2.f(EnumC1217f.CLIENT_CACHED, this.c);
                break;
            case 2:
                m mVar3 = this.f167b;
                mVar3.d().c("split_sdk_ready", L.c(new Pair("traffic_type", "user")));
                mVar3.d().f("split_sdk_ready");
                mVar3.f(EnumC1217f.CLIENT_READY, this.c);
                if (mVar3.h) {
                    mVar3.h = false;
                }
                break;
            default:
                m mVar4 = this.f167b;
                mVar4.d().c("split_sdk_ready_cache", L.c(new Pair("traffic_type", "user")));
                mVar4.d().f("split_sdk_ready_cache");
                mVar4.f(EnumC1217f.CLIENT_CACHED, this.c);
                break;
        }
        return Unit.f18162a;
    }
}
