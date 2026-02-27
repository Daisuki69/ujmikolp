package io.flutter.plugins.urllauncher;

import defpackage.AbstractC1414e;
import io.flutter.plugins.urllauncher.Messages;
import java.util.ArrayList;
import java.util.Map;
import pg.C2042e;
import pg.InterfaceC2041d;
import pg.j;
import pg.q;

/* JADX INFO: loaded from: classes4.dex */
public abstract /* synthetic */ class b {
    public static q a() {
        return Messages.PigeonCodec.INSTANCE;
    }

    public static /* synthetic */ void b(Messages.UrlLauncherApi urlLauncherApi, Object obj, InterfaceC2041d interfaceC2041d) {
        ArrayList<Object> arrayList = new ArrayList<>();
        try {
            arrayList.add(0, urlLauncherApi.canLaunchUrl((String) ((ArrayList) obj).get(0)));
        } catch (Throwable th2) {
            arrayList = Messages.wrapError(th2);
        }
        interfaceC2041d.reply(arrayList);
    }

    public static /* synthetic */ void c(Messages.UrlLauncherApi urlLauncherApi, Object obj, InterfaceC2041d interfaceC2041d) {
        ArrayList<Object> arrayList = new ArrayList<>();
        ArrayList arrayList2 = (ArrayList) obj;
        try {
            arrayList.add(0, urlLauncherApi.launchUrl((String) arrayList2.get(0), (Map) arrayList2.get(1)));
        } catch (Throwable th2) {
            arrayList = Messages.wrapError(th2);
        }
        interfaceC2041d.reply(arrayList);
    }

    public static /* synthetic */ void d(Messages.UrlLauncherApi urlLauncherApi, Object obj, InterfaceC2041d interfaceC2041d) {
        ArrayList<Object> arrayList = new ArrayList<>();
        ArrayList arrayList2 = (ArrayList) obj;
        try {
            arrayList.add(0, urlLauncherApi.openUrlInApp((String) arrayList2.get(0), (Boolean) arrayList2.get(1), (Messages.WebViewOptions) arrayList2.get(2), (Messages.BrowserOptions) arrayList2.get(3)));
        } catch (Throwable th2) {
            arrayList = Messages.wrapError(th2);
        }
        interfaceC2041d.reply(arrayList);
    }

    public static /* synthetic */ void e(Messages.UrlLauncherApi urlLauncherApi, Object obj, InterfaceC2041d interfaceC2041d) {
        ArrayList<Object> arrayList = new ArrayList<>();
        try {
            arrayList.add(0, urlLauncherApi.supportsCustomTabs());
        } catch (Throwable th2) {
            arrayList = Messages.wrapError(th2);
        }
        interfaceC2041d.reply(arrayList);
    }

    public static /* synthetic */ void f(Messages.UrlLauncherApi urlLauncherApi, Object obj, InterfaceC2041d interfaceC2041d) {
        ArrayList<Object> arrayList = new ArrayList<>();
        try {
            urlLauncherApi.closeWebView();
            arrayList.add(0, null);
        } catch (Throwable th2) {
            arrayList = Messages.wrapError(th2);
        }
        interfaceC2041d.reply(arrayList);
    }

    public static void g(j jVar, Messages.UrlLauncherApi urlLauncherApi) {
        h(jVar, "", urlLauncherApi);
    }

    public static void h(j jVar, String str, Messages.UrlLauncherApi urlLauncherApi) {
        String strConcat = str.isEmpty() ? "" : ".".concat(str);
        C2042e c2042e = new C2042e(jVar, AbstractC1414e.h("dev.flutter.pigeon.url_launcher_android.UrlLauncherApi.canLaunchUrl", strConcat), a(), null);
        if (urlLauncherApi != null) {
            c2042e.b(new a(urlLauncherApi, 0));
        } else {
            c2042e.b(null);
        }
        C2042e c2042e2 = new C2042e(jVar, AbstractC1414e.h("dev.flutter.pigeon.url_launcher_android.UrlLauncherApi.launchUrl", strConcat), a(), null);
        if (urlLauncherApi != null) {
            c2042e2.b(new a(urlLauncherApi, 1));
        } else {
            c2042e2.b(null);
        }
        C2042e c2042e3 = new C2042e(jVar, AbstractC1414e.h("dev.flutter.pigeon.url_launcher_android.UrlLauncherApi.openUrlInApp", strConcat), a(), null);
        if (urlLauncherApi != null) {
            c2042e3.b(new a(urlLauncherApi, 2));
        } else {
            c2042e3.b(null);
        }
        C2042e c2042e4 = new C2042e(jVar, AbstractC1414e.h("dev.flutter.pigeon.url_launcher_android.UrlLauncherApi.supportsCustomTabs", strConcat), a(), null);
        if (urlLauncherApi != null) {
            c2042e4.b(new a(urlLauncherApi, 3));
        } else {
            c2042e4.b(null);
        }
        C2042e c2042e5 = new C2042e(jVar, AbstractC1414e.h("dev.flutter.pigeon.url_launcher_android.UrlLauncherApi.closeWebView", strConcat), a(), null);
        if (urlLauncherApi != null) {
            c2042e5.b(new a(urlLauncherApi, 4));
        } else {
            c2042e5.b(null);
        }
    }
}
