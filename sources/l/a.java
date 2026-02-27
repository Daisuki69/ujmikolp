package L;

import D.S;
import android.text.TextUtils;
import com.dynatrace.android.agent.Global;
import dOYHB6.tiZVw8.numX49;
import java.util.concurrent.Callable;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public final class a implements Callable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2790a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ b f2791b;

    public /* synthetic */ a(b bVar, int i) {
        this.f2790a = i;
        this.f2791b = bVar;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        String string;
        Boolean bool;
        switch (this.f2790a) {
            case 0:
                b bVar = this.f2791b;
                try {
                    bVar.f2794d.h();
                    return null;
                } catch (Exception e) {
                    S sC = bVar.f2792a.c();
                    String strB = bVar.b();
                    String localizedMessage = e.getLocalizedMessage();
                    sC.getClass();
                    S.s(strB, localizedMessage);
                    return null;
                }
            default:
                String strTnTj78 = numX49.tnTj78("PgP");
                synchronized (this) {
                    try {
                        S sC2 = this.f2791b.f2792a.c();
                        String strB2 = this.f2791b.b();
                        sC2.getClass();
                        S.s(strB2, "Feature flags init is called");
                        b bVar2 = this.f2791b;
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append("Feature_Flag_" + bVar2.f2792a.f9439a + Global.UNDERSCORE + bVar2.f2793b);
                        sb2.append("/ff_cache.json");
                        string = sb2.toString();
                        this.f2791b.f2795g.clear();
                        String strB3 = this.f2791b.f.b(string);
                        if (TextUtils.isEmpty(strB3)) {
                            S sC3 = this.f2791b.f2792a.c();
                            sC3.getClass();
                            S.s(this.f2791b.b(), strTnTj78 + string);
                        } else {
                            JSONArray jSONArray = new JSONObject(strB3).getJSONArray("kv");
                            if (jSONArray != null && jSONArray.length() > 0) {
                                for (int i = 0; i < jSONArray.length(); i++) {
                                    JSONObject jSONObject = (JSONObject) jSONArray.get(i);
                                    if (jSONObject != null) {
                                        String string2 = jSONObject.getString("n");
                                        String string3 = jSONObject.getString("v");
                                        if (!TextUtils.isEmpty(string2)) {
                                            this.f2791b.f2795g.put(string2, Boolean.valueOf(Boolean.parseBoolean(string3)));
                                        }
                                    }
                                }
                            }
                            S sC4 = this.f2791b.f2792a.c();
                            String strB4 = this.f2791b.b();
                            String str = "Feature flags initialized from file " + string + " with configs  " + this.f2791b.f2795g;
                            sC4.getClass();
                            S.s(strB4, str);
                        }
                        bool = Boolean.TRUE;
                    } catch (Exception e7) {
                        e7.printStackTrace();
                        S sC5 = this.f2791b.f2792a.c();
                        String strB5 = this.f2791b.b();
                        String str2 = "UnArchiveData failed file- " + string + Global.BLANK + e7.getLocalizedMessage();
                        sC5.getClass();
                        S.s(strB5, str2);
                        bool = Boolean.FALSE;
                    } finally {
                    }
                }
                return bool;
        }
    }
}
