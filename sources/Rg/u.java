package Rg;

import ag.C0694d;
import android.app.AlertDialog;
import android.util.Log;
import androidx.fragment.app.FragmentActivity;
import cj.C1110A;
import cj.L;
import cj.x;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import kotlin.Pair;
import ph.U2;

/* JADX INFO: loaded from: classes4.dex */
public abstract class u implements t, Xf.a, t.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5551a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f5552b;

    public /* synthetic */ u(Object obj, int i) {
        this.f5551a = i;
        this.f5552b = obj;
    }

    @Override // Rg.t
    public Set a() {
        Set setEntrySet = ((Map) this.f5552b).entrySet();
        kotlin.jvm.internal.j.g(setEntrySet, "<this>");
        Set setUnmodifiableSet = Collections.unmodifiableSet(setEntrySet);
        kotlin.jvm.internal.j.f(setUnmodifiableSet, "unmodifiableSet(...)");
        return setUnmodifiableSet;
    }

    @Override // Xf.a
    public Map b() {
        try {
            LinkedList linkedListI = i();
            String areaName = d();
            kotlin.jvm.internal.j.h(areaName, "areaName");
            return L.c(new Pair(areaName, linkedListI));
        } catch (IllegalAccessException e) {
            Exception exc = new Exception("Permission Denial: " + e.getMessage());
            String areaName2 = d();
            String strA = jk.b.a(exc);
            kotlin.jvm.internal.j.h(areaName2, "areaName");
            return L.c(new Pair(areaName2, strA));
        } catch (Exception e7) {
            C0694d c0694d = (C0694d) this.f5552b;
            if (c0694d != null) {
                c0694d.b("Application", e7, null);
            }
            String areaName3 = d();
            String strA2 = jk.b.a(e7);
            kotlin.jvm.internal.j.h(areaName3, "areaName");
            return L.c(new Pair(areaName3, strA2));
        }
    }

    @Override // Rg.t
    public List c(String name) {
        kotlin.jvm.internal.j.g(name, "name");
        return (List) ((Map) this.f5552b).get(name);
    }

    @Override // Rg.t
    public void e(Iterable values, String name) {
        kotlin.jvm.internal.j.g(name, "name");
        kotlin.jvm.internal.j.g(values, "values");
        List listM = m(name);
        Iterator it = values.iterator();
        while (it.hasNext()) {
            u((String) it.next());
        }
        x.p(values, listM);
    }

    @Override // t.e
    public List g() {
        return (List) this.f5552b;
    }

    @Override // t.e
    public boolean h() {
        List list = (List) this.f5552b;
        return list.isEmpty() || (list.size() == 1 && ((A.a) list.get(0)).c());
    }

    public abstract LinkedList i();

    public void j(String name, String value) {
        kotlin.jvm.internal.j.g(name, "name");
        kotlin.jvm.internal.j.g(value, "value");
        u(value);
        m(name).add(value);
    }

    public void k(s stringValues) {
        kotlin.jvm.internal.j.g(stringValues, "stringValues");
        stringValues.b(new Ag.j(this, 13));
    }

    public void l() {
        ((Map) this.f5552b).clear();
    }

    public List m(String str) {
        Map map = (Map) this.f5552b;
        List list = (List) map.get(str);
        if (list != null) {
            return list;
        }
        ArrayList arrayList = new ArrayList();
        t(str);
        map.put(str, arrayList);
        return arrayList;
    }

    public String n(String str) {
        List listC = c(str);
        if (listC != null) {
            return (String) C1110A.B(listC);
        }
        return null;
    }

    @Override // Rg.t
    public Set names() {
        return ((Map) this.f5552b).keySet();
    }

    public void o(int i) {
        if (i != 0) {
            FragmentActivity fragmentActivity = (FragmentActivity) this.f5552b;
            if (i == 2) {
                Log.e("OpenCVLoader/BaseLoaderCallback", "Package installation failed!");
                AlertDialog alertDialogCreate = new AlertDialog.Builder(fragmentActivity).create();
                alertDialogCreate.setTitle("OpenCV Manager");
                alertDialogCreate.setMessage("Package installation failed!");
                alertDialogCreate.setCancelable(false);
                alertDialogCreate.setButton(-1, "OK", new kk.b(this, 0));
                alertDialogCreate.show();
                return;
            }
            if (i == 3) {
                Log.d("OpenCVLoader/BaseLoaderCallback", "OpenCV library installation was canceled by user");
                ((FragmentActivity) this.f5552b).finish();
                return;
            }
            if (i != 4) {
                Log.e("OpenCVLoader/BaseLoaderCallback", "OpenCV loading failed!");
                AlertDialog alertDialogCreate2 = new AlertDialog.Builder(fragmentActivity).create();
                alertDialogCreate2.setTitle("OpenCV error");
                alertDialogCreate2.setMessage("OpenCV was not initialised correctly. Application will be shut down");
                alertDialogCreate2.setCancelable(false);
                alertDialogCreate2.setButton(-1, "OK", new kk.b(this, 2));
                alertDialogCreate2.show();
                return;
            }
            Log.d("OpenCVLoader/BaseLoaderCallback", "OpenCV Manager Service is uncompatible with this app!");
            AlertDialog alertDialogCreate3 = new AlertDialog.Builder(fragmentActivity).create();
            alertDialogCreate3.setTitle("OpenCV Manager");
            alertDialogCreate3.setMessage("OpenCV Manager service is incompatible with this app. Try to update it via Google Play.");
            alertDialogCreate3.setCancelable(false);
            alertDialogCreate3.setButton(-1, "OK", new kk.b(this, 1));
            alertDialogCreate3.show();
        }
    }

    public void p(int i, kk.d dVar) {
        FragmentActivity fragmentActivity = (FragmentActivity) this.f5552b;
        if (i == 0) {
            AlertDialog alertDialogCreate = new AlertDialog.Builder(fragmentActivity).create();
            alertDialogCreate.setTitle("Package not found");
            alertDialogCreate.setMessage(dVar.getPackageName().concat(" package was not found! Try to install it?"));
            alertDialogCreate.setCancelable(false);
            alertDialogCreate.setButton(-1, "Yes", new kk.c(0, dVar));
            alertDialogCreate.setButton(-2, "No", new kk.c(1, dVar));
            alertDialogCreate.show();
            return;
        }
        if (i != 1) {
            return;
        }
        AlertDialog alertDialogCreate2 = new AlertDialog.Builder(fragmentActivity).create();
        alertDialogCreate2.setTitle("OpenCV is not ready");
        alertDialogCreate2.setMessage("Installation is in progress. Wait or exit?");
        alertDialogCreate2.setCancelable(false);
        alertDialogCreate2.setButton(-1, "Wait", new kk.c(2, dVar));
        alertDialogCreate2.setButton(-2, "Exit", new kk.c(3, dVar));
        alertDialogCreate2.show();
    }

    public abstract void q();

    public void r() {
        ExecutorService executorService = (ExecutorService) this.f5552b;
        if (executorService.isShutdown()) {
            return;
        }
        executorService.execute(new U2(this, 4));
    }

    public void s() {
        ExecutorService executorService = (ExecutorService) this.f5552b;
        if (executorService.isShutdown()) {
            return;
        }
        try {
            executorService.shutdownNow();
            if (executorService.awaitTermination(30L, TimeUnit.SECONDS)) {
                return;
            }
            Ri.a.g("Update worker did not terminate");
        } catch (InterruptedException unused) {
            executorService.shutdownNow();
            Thread.currentThread().interrupt();
        }
    }

    public void t(String name) {
        kotlin.jvm.internal.j.g(name, "name");
    }

    public String toString() {
        switch (this.f5551a) {
            case 3:
                StringBuilder sb2 = new StringBuilder();
                List list = (List) this.f5552b;
                if (!list.isEmpty()) {
                    sb2.append("values=");
                    sb2.append(Arrays.toString(list.toArray()));
                }
                return sb2.toString();
            default:
                return super.toString();
        }
    }

    public void u(String value) {
        kotlin.jvm.internal.j.g(value, "value");
    }

    public u(int i) {
        this.f5551a = i;
        switch (i) {
            case 4:
                this.f5552b = Executors.newSingleThreadExecutor();
                break;
            default:
                this.f5552b = new h();
                break;
        }
    }
}
