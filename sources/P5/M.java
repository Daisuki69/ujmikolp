package P5;

import android.app.Application;
import android.content.Context;
import cg.InterfaceC1101b;
import com.paymaya.common.utility.C1220i;
import java.util.Objects;
import net.zetetic.database.sqlcipher.SQLiteOpenHelper;

/* JADX INFO: loaded from: classes4.dex */
public final class M implements InterfaceC1101b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5022a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final InterfaceC1101b f5023b;
    public final InterfaceC1101b c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final InterfaceC1101b f5024d;
    public final InterfaceC1101b e;

    public /* synthetic */ M(Object obj, InterfaceC1101b interfaceC1101b, InterfaceC1101b interfaceC1101b2, InterfaceC1101b interfaceC1101b3, InterfaceC1101b interfaceC1101b4, int i) {
        this.f5022a = i;
        this.f5023b = interfaceC1101b;
        this.c = interfaceC1101b2;
        this.f5024d = interfaceC1101b3;
        this.e = interfaceC1101b4;
    }

    @Override // aj.InterfaceC0716a
    public final Object get() {
        switch (this.f5022a) {
            case 0:
                return new B5.d((Application) this.f5023b.get(), (com.paymaya.data.preference.a) this.c.get(), (B5.l) this.f5024d.get(), (S5.c) this.e.get());
            case 1:
                return new B5.c((Context) this.f5023b.get(), (com.paymaya.data.preference.a) this.c.get(), (A5.m) this.f5024d.get(), (S5.c) this.e.get());
            case 2:
                Xe.f fVar = (Xe.f) this.c.get();
                SQLiteOpenHelper sQLiteOpenHelper = (SQLiteOpenHelper) this.f5024d.get();
                String strF = ((com.paymaya.data.preference.a) this.e.get()).f();
                Nh.j jVar = Th.e.c;
                Objects.requireNonNull(jVar, "scheduler is null");
                eh.e eVar = new eh.e(jVar, 1);
                fVar.getClass();
                Wh.b bVar = new Wh.b();
                strF.toCharArray();
                return new Xe.d(sQLiteOpenHelper, fVar.f6616a, bVar, bVar, eVar);
            default:
                B5.i flowController = (B5.i) this.f5023b.get();
                com.paymaya.data.preference.a preference = (com.paymaya.data.preference.a) this.c.get();
                C1220i analyticsUtils = (C1220i) this.f5024d.get();
                S5.c flagConfigurationService = (S5.c) this.e.get();
                kotlin.jvm.internal.j.g(flowController, "flowController");
                kotlin.jvm.internal.j.g(preference, "preference");
                kotlin.jvm.internal.j.g(analyticsUtils, "analyticsUtils");
                kotlin.jvm.internal.j.g(flagConfigurationService, "flagConfigurationService");
                return new Le.m(flowController, preference, analyticsUtils, flagConfigurationService);
        }
    }
}
