package pc;

import Nb.c;
import com.paymaya.mayaui.userprofileupdate.view.fragment.base.MayaUpdateProfileBaseFragment;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.j;
import okhttp3.ResponseBody;
import org.json.JSONException;
import org.json.JSONObject;
import retrofit2.HttpException;
import retrofit2.Response;
import tc.InterfaceC2282c;
import xc.InterfaceC2469a;
import y5.AbstractC2509a;

/* JADX INFO: renamed from: pc.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC2033b extends AbstractC2509a {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final com.paymaya.data.preference.a f19086d;
    public EnumC2032a e = EnumC2032a.f19083a;
    public boolean f;

    public AbstractC2033b(com.paymaya.data.preference.a aVar) {
        this.f19086d = aVar;
    }

    public abstract void k();

    public abstract void l();

    public final void m(Throwable throwable, Function1 function1) {
        Response<?> response;
        ResponseBody responseBodyErrorBody;
        j.g(throwable, "throwable");
        int iOptInt = 0;
        if ((throwable instanceof HttpException) && (response = ((HttpException) throwable).response()) != null && (responseBodyErrorBody = response.errorBody()) != null) {
            try {
                iOptInt = new JSONObject(responseBodyErrorBody.string()).optInt("code", 0);
            } catch (JSONException unused) {
                yk.a.b();
            }
        }
        if (iOptInt != 30100) {
            function1.invoke(Integer.valueOf(iOptInt));
            return;
        }
        this.f19086d.r0(true);
        this.f = true;
        InterfaceC2282c interfaceC2282c = ((MayaUpdateProfileBaseFragment) ((InterfaceC2469a) this.c.get())).f14238W;
        if (interfaceC2282c != null) {
            interfaceC2282c.u();
        }
    }

    public final void n(Throwable error, EnumC2032a enumC2032a, boolean z4) {
        j.g(error, "error");
        this.e = enumC2032a;
        m(error, new c(this, z4, 3));
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0018  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void o() {
        /*
            r2 = this;
            boolean r0 = r2.f
            if (r0 == 0) goto L22
            pc.a r0 = r2.e
            int r0 = r0.ordinal()
            r1 = 1
            if (r0 == r1) goto L18
            r1 = 2
            if (r0 == r1) goto L14
            r1 = 3
            if (r0 == r1) goto L18
            goto L1b
        L14:
            r2.l()
            goto L1b
        L18:
            r2.k()
        L1b:
            pc.a r0 = pc.EnumC2032a.f19083a
            r2.e = r0
            r0 = 0
            r2.f = r0
        L22:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: pc.AbstractC2033b.o():void");
    }
}
