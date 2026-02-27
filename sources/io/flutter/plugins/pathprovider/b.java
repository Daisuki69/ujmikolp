package io.flutter.plugins.pathprovider;

import defpackage.AbstractC1414e;
import io.flutter.plugins.pathprovider.Messages;
import java.util.ArrayList;
import pg.C2042e;
import pg.InterfaceC2040c;
import pg.InterfaceC2041d;
import pg.j;
import pg.q;

/* JADX INFO: loaded from: classes4.dex */
public abstract /* synthetic */ class b {
    public static q a() {
        return Messages.PigeonCodec.INSTANCE;
    }

    public static /* synthetic */ void b(Messages.PathProviderApi pathProviderApi, Object obj, InterfaceC2041d interfaceC2041d) {
        ArrayList<Object> arrayList = new ArrayList<>();
        try {
            arrayList.add(0, pathProviderApi.getTemporaryPath());
        } catch (Throwable th2) {
            arrayList = Messages.wrapError(th2);
        }
        interfaceC2041d.reply(arrayList);
    }

    public static /* synthetic */ void c(Messages.PathProviderApi pathProviderApi, Object obj, InterfaceC2041d interfaceC2041d) {
        ArrayList<Object> arrayList = new ArrayList<>();
        try {
            arrayList.add(0, pathProviderApi.getApplicationSupportPath());
        } catch (Throwable th2) {
            arrayList = Messages.wrapError(th2);
        }
        interfaceC2041d.reply(arrayList);
    }

    public static /* synthetic */ void d(Messages.PathProviderApi pathProviderApi, Object obj, InterfaceC2041d interfaceC2041d) {
        ArrayList<Object> arrayList = new ArrayList<>();
        try {
            arrayList.add(0, pathProviderApi.getApplicationDocumentsPath());
        } catch (Throwable th2) {
            arrayList = Messages.wrapError(th2);
        }
        interfaceC2041d.reply(arrayList);
    }

    public static /* synthetic */ void e(Messages.PathProviderApi pathProviderApi, Object obj, InterfaceC2041d interfaceC2041d) {
        ArrayList<Object> arrayList = new ArrayList<>();
        try {
            arrayList.add(0, pathProviderApi.getApplicationCachePath());
        } catch (Throwable th2) {
            arrayList = Messages.wrapError(th2);
        }
        interfaceC2041d.reply(arrayList);
    }

    public static /* synthetic */ void f(Messages.PathProviderApi pathProviderApi, Object obj, InterfaceC2041d interfaceC2041d) {
        ArrayList<Object> arrayList = new ArrayList<>();
        try {
            arrayList.add(0, pathProviderApi.getExternalStoragePath());
        } catch (Throwable th2) {
            arrayList = Messages.wrapError(th2);
        }
        interfaceC2041d.reply(arrayList);
    }

    public static /* synthetic */ void g(Messages.PathProviderApi pathProviderApi, Object obj, InterfaceC2041d interfaceC2041d) {
        ArrayList<Object> arrayList = new ArrayList<>();
        try {
            arrayList.add(0, pathProviderApi.getExternalCachePaths());
        } catch (Throwable th2) {
            arrayList = Messages.wrapError(th2);
        }
        interfaceC2041d.reply(arrayList);
    }

    public static /* synthetic */ void h(Messages.PathProviderApi pathProviderApi, Object obj, InterfaceC2041d interfaceC2041d) {
        ArrayList<Object> arrayList = new ArrayList<>();
        try {
            arrayList.add(0, pathProviderApi.getExternalStoragePaths((Messages.StorageDirectory) ((ArrayList) obj).get(0)));
        } catch (Throwable th2) {
            arrayList = Messages.wrapError(th2);
        }
        interfaceC2041d.reply(arrayList);
    }

    public static void i(j jVar, Messages.PathProviderApi pathProviderApi) {
        j(jVar, "", pathProviderApi);
    }

    public static void j(j jVar, String str, final Messages.PathProviderApi pathProviderApi) {
        String strConcat = str.isEmpty() ? "" : ".".concat(str);
        C2042e c2042e = new C2042e(jVar, AbstractC1414e.h("dev.flutter.pigeon.path_provider_android.PathProviderApi.getTemporaryPath", strConcat), a(), jVar.makeBackgroundTaskQueue());
        if (pathProviderApi != null) {
            final int i = 0;
            c2042e.b(new InterfaceC2040c() { // from class: io.flutter.plugins.pathprovider.a
                @Override // pg.InterfaceC2040c
                public final void onMessage(Object obj, InterfaceC2041d interfaceC2041d) {
                    switch (i) {
                        case 0:
                            b.b(pathProviderApi, obj, interfaceC2041d);
                            break;
                        case 1:
                            b.c(pathProviderApi, obj, interfaceC2041d);
                            break;
                        case 2:
                            b.d(pathProviderApi, obj, interfaceC2041d);
                            break;
                        case 3:
                            b.e(pathProviderApi, obj, interfaceC2041d);
                            break;
                        case 4:
                            b.f(pathProviderApi, obj, interfaceC2041d);
                            break;
                        case 5:
                            b.g(pathProviderApi, obj, interfaceC2041d);
                            break;
                        default:
                            b.h(pathProviderApi, obj, interfaceC2041d);
                            break;
                    }
                }
            });
        } else {
            c2042e.b(null);
        }
        C2042e c2042e2 = new C2042e(jVar, AbstractC1414e.h("dev.flutter.pigeon.path_provider_android.PathProviderApi.getApplicationSupportPath", strConcat), a(), jVar.makeBackgroundTaskQueue());
        if (pathProviderApi != null) {
            final int i4 = 1;
            c2042e2.b(new InterfaceC2040c() { // from class: io.flutter.plugins.pathprovider.a
                @Override // pg.InterfaceC2040c
                public final void onMessage(Object obj, InterfaceC2041d interfaceC2041d) {
                    switch (i4) {
                        case 0:
                            b.b(pathProviderApi, obj, interfaceC2041d);
                            break;
                        case 1:
                            b.c(pathProviderApi, obj, interfaceC2041d);
                            break;
                        case 2:
                            b.d(pathProviderApi, obj, interfaceC2041d);
                            break;
                        case 3:
                            b.e(pathProviderApi, obj, interfaceC2041d);
                            break;
                        case 4:
                            b.f(pathProviderApi, obj, interfaceC2041d);
                            break;
                        case 5:
                            b.g(pathProviderApi, obj, interfaceC2041d);
                            break;
                        default:
                            b.h(pathProviderApi, obj, interfaceC2041d);
                            break;
                    }
                }
            });
        } else {
            c2042e2.b(null);
        }
        C2042e c2042e3 = new C2042e(jVar, AbstractC1414e.h("dev.flutter.pigeon.path_provider_android.PathProviderApi.getApplicationDocumentsPath", strConcat), a(), jVar.makeBackgroundTaskQueue());
        if (pathProviderApi != null) {
            final int i6 = 2;
            c2042e3.b(new InterfaceC2040c() { // from class: io.flutter.plugins.pathprovider.a
                @Override // pg.InterfaceC2040c
                public final void onMessage(Object obj, InterfaceC2041d interfaceC2041d) {
                    switch (i6) {
                        case 0:
                            b.b(pathProviderApi, obj, interfaceC2041d);
                            break;
                        case 1:
                            b.c(pathProviderApi, obj, interfaceC2041d);
                            break;
                        case 2:
                            b.d(pathProviderApi, obj, interfaceC2041d);
                            break;
                        case 3:
                            b.e(pathProviderApi, obj, interfaceC2041d);
                            break;
                        case 4:
                            b.f(pathProviderApi, obj, interfaceC2041d);
                            break;
                        case 5:
                            b.g(pathProviderApi, obj, interfaceC2041d);
                            break;
                        default:
                            b.h(pathProviderApi, obj, interfaceC2041d);
                            break;
                    }
                }
            });
        } else {
            c2042e3.b(null);
        }
        C2042e c2042e4 = new C2042e(jVar, AbstractC1414e.h("dev.flutter.pigeon.path_provider_android.PathProviderApi.getApplicationCachePath", strConcat), a(), jVar.makeBackgroundTaskQueue());
        if (pathProviderApi != null) {
            final int i10 = 3;
            c2042e4.b(new InterfaceC2040c() { // from class: io.flutter.plugins.pathprovider.a
                @Override // pg.InterfaceC2040c
                public final void onMessage(Object obj, InterfaceC2041d interfaceC2041d) {
                    switch (i10) {
                        case 0:
                            b.b(pathProviderApi, obj, interfaceC2041d);
                            break;
                        case 1:
                            b.c(pathProviderApi, obj, interfaceC2041d);
                            break;
                        case 2:
                            b.d(pathProviderApi, obj, interfaceC2041d);
                            break;
                        case 3:
                            b.e(pathProviderApi, obj, interfaceC2041d);
                            break;
                        case 4:
                            b.f(pathProviderApi, obj, interfaceC2041d);
                            break;
                        case 5:
                            b.g(pathProviderApi, obj, interfaceC2041d);
                            break;
                        default:
                            b.h(pathProviderApi, obj, interfaceC2041d);
                            break;
                    }
                }
            });
        } else {
            c2042e4.b(null);
        }
        C2042e c2042e5 = new C2042e(jVar, AbstractC1414e.h("dev.flutter.pigeon.path_provider_android.PathProviderApi.getExternalStoragePath", strConcat), a(), jVar.makeBackgroundTaskQueue());
        if (pathProviderApi != null) {
            final int i11 = 4;
            c2042e5.b(new InterfaceC2040c() { // from class: io.flutter.plugins.pathprovider.a
                @Override // pg.InterfaceC2040c
                public final void onMessage(Object obj, InterfaceC2041d interfaceC2041d) {
                    switch (i11) {
                        case 0:
                            b.b(pathProviderApi, obj, interfaceC2041d);
                            break;
                        case 1:
                            b.c(pathProviderApi, obj, interfaceC2041d);
                            break;
                        case 2:
                            b.d(pathProviderApi, obj, interfaceC2041d);
                            break;
                        case 3:
                            b.e(pathProviderApi, obj, interfaceC2041d);
                            break;
                        case 4:
                            b.f(pathProviderApi, obj, interfaceC2041d);
                            break;
                        case 5:
                            b.g(pathProviderApi, obj, interfaceC2041d);
                            break;
                        default:
                            b.h(pathProviderApi, obj, interfaceC2041d);
                            break;
                    }
                }
            });
        } else {
            c2042e5.b(null);
        }
        C2042e c2042e6 = new C2042e(jVar, AbstractC1414e.h("dev.flutter.pigeon.path_provider_android.PathProviderApi.getExternalCachePaths", strConcat), a(), jVar.makeBackgroundTaskQueue());
        if (pathProviderApi != null) {
            final int i12 = 5;
            c2042e6.b(new InterfaceC2040c() { // from class: io.flutter.plugins.pathprovider.a
                @Override // pg.InterfaceC2040c
                public final void onMessage(Object obj, InterfaceC2041d interfaceC2041d) {
                    switch (i12) {
                        case 0:
                            b.b(pathProviderApi, obj, interfaceC2041d);
                            break;
                        case 1:
                            b.c(pathProviderApi, obj, interfaceC2041d);
                            break;
                        case 2:
                            b.d(pathProviderApi, obj, interfaceC2041d);
                            break;
                        case 3:
                            b.e(pathProviderApi, obj, interfaceC2041d);
                            break;
                        case 4:
                            b.f(pathProviderApi, obj, interfaceC2041d);
                            break;
                        case 5:
                            b.g(pathProviderApi, obj, interfaceC2041d);
                            break;
                        default:
                            b.h(pathProviderApi, obj, interfaceC2041d);
                            break;
                    }
                }
            });
        } else {
            c2042e6.b(null);
        }
        C2042e c2042e7 = new C2042e(jVar, AbstractC1414e.h("dev.flutter.pigeon.path_provider_android.PathProviderApi.getExternalStoragePaths", strConcat), a(), jVar.makeBackgroundTaskQueue());
        if (pathProviderApi == null) {
            c2042e7.b(null);
        } else {
            final int i13 = 6;
            c2042e7.b(new InterfaceC2040c() { // from class: io.flutter.plugins.pathprovider.a
                @Override // pg.InterfaceC2040c
                public final void onMessage(Object obj, InterfaceC2041d interfaceC2041d) {
                    switch (i13) {
                        case 0:
                            b.b(pathProviderApi, obj, interfaceC2041d);
                            break;
                        case 1:
                            b.c(pathProviderApi, obj, interfaceC2041d);
                            break;
                        case 2:
                            b.d(pathProviderApi, obj, interfaceC2041d);
                            break;
                        case 3:
                            b.e(pathProviderApi, obj, interfaceC2041d);
                            break;
                        case 4:
                            b.f(pathProviderApi, obj, interfaceC2041d);
                            break;
                        case 5:
                            b.g(pathProviderApi, obj, interfaceC2041d);
                            break;
                        default:
                            b.h(pathProviderApi, obj, interfaceC2041d);
                            break;
                    }
                }
            });
        }
    }
}
