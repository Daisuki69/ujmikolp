package io.flutter.plugins.sharedpreferences;

import defpackage.AbstractC1414e;
import io.flutter.plugins.sharedpreferences.Messages;
import java.util.ArrayList;
import java.util.List;
import pg.C2042e;
import pg.InterfaceC2040c;
import pg.InterfaceC2041d;
import pg.h;
import pg.j;
import pg.q;

/* JADX INFO: loaded from: classes4.dex */
public abstract /* synthetic */ class b {
    public static q a() {
        return Messages.PigeonCodec.INSTANCE;
    }

    public static /* synthetic */ void b(Messages.SharedPreferencesApi sharedPreferencesApi, Object obj, InterfaceC2041d interfaceC2041d) {
        ArrayList<Object> arrayList = new ArrayList<>();
        try {
            arrayList.add(0, sharedPreferencesApi.remove((String) ((ArrayList) obj).get(0)));
        } catch (Throwable th2) {
            arrayList = Messages.wrapError(th2);
        }
        interfaceC2041d.reply(arrayList);
    }

    public static /* synthetic */ void c(Messages.SharedPreferencesApi sharedPreferencesApi, Object obj, InterfaceC2041d interfaceC2041d) {
        ArrayList<Object> arrayList = new ArrayList<>();
        ArrayList arrayList2 = (ArrayList) obj;
        try {
            arrayList.add(0, sharedPreferencesApi.setBool((String) arrayList2.get(0), (Boolean) arrayList2.get(1)));
        } catch (Throwable th2) {
            arrayList = Messages.wrapError(th2);
        }
        interfaceC2041d.reply(arrayList);
    }

    public static /* synthetic */ void d(Messages.SharedPreferencesApi sharedPreferencesApi, Object obj, InterfaceC2041d interfaceC2041d) {
        ArrayList<Object> arrayList = new ArrayList<>();
        ArrayList arrayList2 = (ArrayList) obj;
        try {
            arrayList.add(0, sharedPreferencesApi.setString((String) arrayList2.get(0), (String) arrayList2.get(1)));
        } catch (Throwable th2) {
            arrayList = Messages.wrapError(th2);
        }
        interfaceC2041d.reply(arrayList);
    }

    public static /* synthetic */ void e(Messages.SharedPreferencesApi sharedPreferencesApi, Object obj, InterfaceC2041d interfaceC2041d) {
        ArrayList<Object> arrayList = new ArrayList<>();
        ArrayList arrayList2 = (ArrayList) obj;
        try {
            arrayList.add(0, sharedPreferencesApi.setInt((String) arrayList2.get(0), (Long) arrayList2.get(1)));
        } catch (Throwable th2) {
            arrayList = Messages.wrapError(th2);
        }
        interfaceC2041d.reply(arrayList);
    }

    public static /* synthetic */ void f(Messages.SharedPreferencesApi sharedPreferencesApi, Object obj, InterfaceC2041d interfaceC2041d) {
        ArrayList<Object> arrayList = new ArrayList<>();
        ArrayList arrayList2 = (ArrayList) obj;
        try {
            arrayList.add(0, sharedPreferencesApi.setDouble((String) arrayList2.get(0), (Double) arrayList2.get(1)));
        } catch (Throwable th2) {
            arrayList = Messages.wrapError(th2);
        }
        interfaceC2041d.reply(arrayList);
    }

    public static /* synthetic */ void g(Messages.SharedPreferencesApi sharedPreferencesApi, Object obj, InterfaceC2041d interfaceC2041d) {
        ArrayList<Object> arrayList = new ArrayList<>();
        ArrayList arrayList2 = (ArrayList) obj;
        try {
            arrayList.add(0, sharedPreferencesApi.setEncodedStringList((String) arrayList2.get(0), (String) arrayList2.get(1)));
        } catch (Throwable th2) {
            arrayList = Messages.wrapError(th2);
        }
        interfaceC2041d.reply(arrayList);
    }

    public static /* synthetic */ void h(Messages.SharedPreferencesApi sharedPreferencesApi, Object obj, InterfaceC2041d interfaceC2041d) {
        ArrayList<Object> arrayList = new ArrayList<>();
        ArrayList arrayList2 = (ArrayList) obj;
        try {
            arrayList.add(0, sharedPreferencesApi.setDeprecatedStringList((String) arrayList2.get(0), (List) arrayList2.get(1)));
        } catch (Throwable th2) {
            arrayList = Messages.wrapError(th2);
        }
        interfaceC2041d.reply(arrayList);
    }

    public static /* synthetic */ void i(Messages.SharedPreferencesApi sharedPreferencesApi, Object obj, InterfaceC2041d interfaceC2041d) {
        ArrayList<Object> arrayList = new ArrayList<>();
        ArrayList arrayList2 = (ArrayList) obj;
        try {
            arrayList.add(0, sharedPreferencesApi.clear((String) arrayList2.get(0), (List) arrayList2.get(1)));
        } catch (Throwable th2) {
            arrayList = Messages.wrapError(th2);
        }
        interfaceC2041d.reply(arrayList);
    }

    public static /* synthetic */ void j(Messages.SharedPreferencesApi sharedPreferencesApi, Object obj, InterfaceC2041d interfaceC2041d) {
        ArrayList<Object> arrayList = new ArrayList<>();
        ArrayList arrayList2 = (ArrayList) obj;
        try {
            arrayList.add(0, sharedPreferencesApi.getAll((String) arrayList2.get(0), (List) arrayList2.get(1)));
        } catch (Throwable th2) {
            arrayList = Messages.wrapError(th2);
        }
        interfaceC2041d.reply(arrayList);
    }

    public static void k(j jVar, Messages.SharedPreferencesApi sharedPreferencesApi) {
        l(jVar, "", sharedPreferencesApi);
    }

    public static void l(j jVar, String str, final Messages.SharedPreferencesApi sharedPreferencesApi) {
        String strConcat = str.isEmpty() ? "" : ".".concat(str);
        h hVarMakeBackgroundTaskQueue = jVar.makeBackgroundTaskQueue();
        C2042e c2042e = new C2042e(jVar, AbstractC1414e.h("dev.flutter.pigeon.shared_preferences_android.SharedPreferencesApi.remove", strConcat), a(), hVarMakeBackgroundTaskQueue);
        if (sharedPreferencesApi != null) {
            final int i = 0;
            c2042e.b(new InterfaceC2040c() { // from class: io.flutter.plugins.sharedpreferences.a
                @Override // pg.InterfaceC2040c
                public final void onMessage(Object obj, InterfaceC2041d interfaceC2041d) {
                    switch (i) {
                        case 0:
                            b.b(sharedPreferencesApi, obj, interfaceC2041d);
                            break;
                        case 1:
                            b.c(sharedPreferencesApi, obj, interfaceC2041d);
                            break;
                        case 2:
                            b.d(sharedPreferencesApi, obj, interfaceC2041d);
                            break;
                        case 3:
                            b.e(sharedPreferencesApi, obj, interfaceC2041d);
                            break;
                        case 4:
                            b.f(sharedPreferencesApi, obj, interfaceC2041d);
                            break;
                        case 5:
                            b.g(sharedPreferencesApi, obj, interfaceC2041d);
                            break;
                        case 6:
                            b.h(sharedPreferencesApi, obj, interfaceC2041d);
                            break;
                        case 7:
                            b.i(sharedPreferencesApi, obj, interfaceC2041d);
                            break;
                        default:
                            b.j(sharedPreferencesApi, obj, interfaceC2041d);
                            break;
                    }
                }
            });
        } else {
            c2042e.b(null);
        }
        C2042e c2042e2 = new C2042e(jVar, AbstractC1414e.h("dev.flutter.pigeon.shared_preferences_android.SharedPreferencesApi.setBool", strConcat), a(), hVarMakeBackgroundTaskQueue);
        if (sharedPreferencesApi != null) {
            final int i4 = 1;
            c2042e2.b(new InterfaceC2040c() { // from class: io.flutter.plugins.sharedpreferences.a
                @Override // pg.InterfaceC2040c
                public final void onMessage(Object obj, InterfaceC2041d interfaceC2041d) {
                    switch (i4) {
                        case 0:
                            b.b(sharedPreferencesApi, obj, interfaceC2041d);
                            break;
                        case 1:
                            b.c(sharedPreferencesApi, obj, interfaceC2041d);
                            break;
                        case 2:
                            b.d(sharedPreferencesApi, obj, interfaceC2041d);
                            break;
                        case 3:
                            b.e(sharedPreferencesApi, obj, interfaceC2041d);
                            break;
                        case 4:
                            b.f(sharedPreferencesApi, obj, interfaceC2041d);
                            break;
                        case 5:
                            b.g(sharedPreferencesApi, obj, interfaceC2041d);
                            break;
                        case 6:
                            b.h(sharedPreferencesApi, obj, interfaceC2041d);
                            break;
                        case 7:
                            b.i(sharedPreferencesApi, obj, interfaceC2041d);
                            break;
                        default:
                            b.j(sharedPreferencesApi, obj, interfaceC2041d);
                            break;
                    }
                }
            });
        } else {
            c2042e2.b(null);
        }
        C2042e c2042e3 = new C2042e(jVar, AbstractC1414e.h("dev.flutter.pigeon.shared_preferences_android.SharedPreferencesApi.setString", strConcat), a(), hVarMakeBackgroundTaskQueue);
        if (sharedPreferencesApi != null) {
            final int i6 = 2;
            c2042e3.b(new InterfaceC2040c() { // from class: io.flutter.plugins.sharedpreferences.a
                @Override // pg.InterfaceC2040c
                public final void onMessage(Object obj, InterfaceC2041d interfaceC2041d) {
                    switch (i6) {
                        case 0:
                            b.b(sharedPreferencesApi, obj, interfaceC2041d);
                            break;
                        case 1:
                            b.c(sharedPreferencesApi, obj, interfaceC2041d);
                            break;
                        case 2:
                            b.d(sharedPreferencesApi, obj, interfaceC2041d);
                            break;
                        case 3:
                            b.e(sharedPreferencesApi, obj, interfaceC2041d);
                            break;
                        case 4:
                            b.f(sharedPreferencesApi, obj, interfaceC2041d);
                            break;
                        case 5:
                            b.g(sharedPreferencesApi, obj, interfaceC2041d);
                            break;
                        case 6:
                            b.h(sharedPreferencesApi, obj, interfaceC2041d);
                            break;
                        case 7:
                            b.i(sharedPreferencesApi, obj, interfaceC2041d);
                            break;
                        default:
                            b.j(sharedPreferencesApi, obj, interfaceC2041d);
                            break;
                    }
                }
            });
        } else {
            c2042e3.b(null);
        }
        C2042e c2042e4 = new C2042e(jVar, AbstractC1414e.h("dev.flutter.pigeon.shared_preferences_android.SharedPreferencesApi.setInt", strConcat), a(), hVarMakeBackgroundTaskQueue);
        if (sharedPreferencesApi != null) {
            final int i10 = 3;
            c2042e4.b(new InterfaceC2040c() { // from class: io.flutter.plugins.sharedpreferences.a
                @Override // pg.InterfaceC2040c
                public final void onMessage(Object obj, InterfaceC2041d interfaceC2041d) {
                    switch (i10) {
                        case 0:
                            b.b(sharedPreferencesApi, obj, interfaceC2041d);
                            break;
                        case 1:
                            b.c(sharedPreferencesApi, obj, interfaceC2041d);
                            break;
                        case 2:
                            b.d(sharedPreferencesApi, obj, interfaceC2041d);
                            break;
                        case 3:
                            b.e(sharedPreferencesApi, obj, interfaceC2041d);
                            break;
                        case 4:
                            b.f(sharedPreferencesApi, obj, interfaceC2041d);
                            break;
                        case 5:
                            b.g(sharedPreferencesApi, obj, interfaceC2041d);
                            break;
                        case 6:
                            b.h(sharedPreferencesApi, obj, interfaceC2041d);
                            break;
                        case 7:
                            b.i(sharedPreferencesApi, obj, interfaceC2041d);
                            break;
                        default:
                            b.j(sharedPreferencesApi, obj, interfaceC2041d);
                            break;
                    }
                }
            });
        } else {
            c2042e4.b(null);
        }
        C2042e c2042e5 = new C2042e(jVar, AbstractC1414e.h("dev.flutter.pigeon.shared_preferences_android.SharedPreferencesApi.setDouble", strConcat), a(), hVarMakeBackgroundTaskQueue);
        if (sharedPreferencesApi != null) {
            final int i11 = 4;
            c2042e5.b(new InterfaceC2040c() { // from class: io.flutter.plugins.sharedpreferences.a
                @Override // pg.InterfaceC2040c
                public final void onMessage(Object obj, InterfaceC2041d interfaceC2041d) {
                    switch (i11) {
                        case 0:
                            b.b(sharedPreferencesApi, obj, interfaceC2041d);
                            break;
                        case 1:
                            b.c(sharedPreferencesApi, obj, interfaceC2041d);
                            break;
                        case 2:
                            b.d(sharedPreferencesApi, obj, interfaceC2041d);
                            break;
                        case 3:
                            b.e(sharedPreferencesApi, obj, interfaceC2041d);
                            break;
                        case 4:
                            b.f(sharedPreferencesApi, obj, interfaceC2041d);
                            break;
                        case 5:
                            b.g(sharedPreferencesApi, obj, interfaceC2041d);
                            break;
                        case 6:
                            b.h(sharedPreferencesApi, obj, interfaceC2041d);
                            break;
                        case 7:
                            b.i(sharedPreferencesApi, obj, interfaceC2041d);
                            break;
                        default:
                            b.j(sharedPreferencesApi, obj, interfaceC2041d);
                            break;
                    }
                }
            });
        } else {
            c2042e5.b(null);
        }
        C2042e c2042e6 = new C2042e(jVar, AbstractC1414e.h("dev.flutter.pigeon.shared_preferences_android.SharedPreferencesApi.setEncodedStringList", strConcat), a(), hVarMakeBackgroundTaskQueue);
        if (sharedPreferencesApi != null) {
            final int i12 = 5;
            c2042e6.b(new InterfaceC2040c() { // from class: io.flutter.plugins.sharedpreferences.a
                @Override // pg.InterfaceC2040c
                public final void onMessage(Object obj, InterfaceC2041d interfaceC2041d) {
                    switch (i12) {
                        case 0:
                            b.b(sharedPreferencesApi, obj, interfaceC2041d);
                            break;
                        case 1:
                            b.c(sharedPreferencesApi, obj, interfaceC2041d);
                            break;
                        case 2:
                            b.d(sharedPreferencesApi, obj, interfaceC2041d);
                            break;
                        case 3:
                            b.e(sharedPreferencesApi, obj, interfaceC2041d);
                            break;
                        case 4:
                            b.f(sharedPreferencesApi, obj, interfaceC2041d);
                            break;
                        case 5:
                            b.g(sharedPreferencesApi, obj, interfaceC2041d);
                            break;
                        case 6:
                            b.h(sharedPreferencesApi, obj, interfaceC2041d);
                            break;
                        case 7:
                            b.i(sharedPreferencesApi, obj, interfaceC2041d);
                            break;
                        default:
                            b.j(sharedPreferencesApi, obj, interfaceC2041d);
                            break;
                    }
                }
            });
        } else {
            c2042e6.b(null);
        }
        C2042e c2042e7 = new C2042e(jVar, AbstractC1414e.h("dev.flutter.pigeon.shared_preferences_android.SharedPreferencesApi.setDeprecatedStringList", strConcat), a(), hVarMakeBackgroundTaskQueue);
        if (sharedPreferencesApi != null) {
            final int i13 = 6;
            c2042e7.b(new InterfaceC2040c() { // from class: io.flutter.plugins.sharedpreferences.a
                @Override // pg.InterfaceC2040c
                public final void onMessage(Object obj, InterfaceC2041d interfaceC2041d) {
                    switch (i13) {
                        case 0:
                            b.b(sharedPreferencesApi, obj, interfaceC2041d);
                            break;
                        case 1:
                            b.c(sharedPreferencesApi, obj, interfaceC2041d);
                            break;
                        case 2:
                            b.d(sharedPreferencesApi, obj, interfaceC2041d);
                            break;
                        case 3:
                            b.e(sharedPreferencesApi, obj, interfaceC2041d);
                            break;
                        case 4:
                            b.f(sharedPreferencesApi, obj, interfaceC2041d);
                            break;
                        case 5:
                            b.g(sharedPreferencesApi, obj, interfaceC2041d);
                            break;
                        case 6:
                            b.h(sharedPreferencesApi, obj, interfaceC2041d);
                            break;
                        case 7:
                            b.i(sharedPreferencesApi, obj, interfaceC2041d);
                            break;
                        default:
                            b.j(sharedPreferencesApi, obj, interfaceC2041d);
                            break;
                    }
                }
            });
        } else {
            c2042e7.b(null);
        }
        C2042e c2042e8 = new C2042e(jVar, AbstractC1414e.h("dev.flutter.pigeon.shared_preferences_android.SharedPreferencesApi.clear", strConcat), a(), hVarMakeBackgroundTaskQueue);
        if (sharedPreferencesApi != null) {
            final int i14 = 7;
            c2042e8.b(new InterfaceC2040c() { // from class: io.flutter.plugins.sharedpreferences.a
                @Override // pg.InterfaceC2040c
                public final void onMessage(Object obj, InterfaceC2041d interfaceC2041d) {
                    switch (i14) {
                        case 0:
                            b.b(sharedPreferencesApi, obj, interfaceC2041d);
                            break;
                        case 1:
                            b.c(sharedPreferencesApi, obj, interfaceC2041d);
                            break;
                        case 2:
                            b.d(sharedPreferencesApi, obj, interfaceC2041d);
                            break;
                        case 3:
                            b.e(sharedPreferencesApi, obj, interfaceC2041d);
                            break;
                        case 4:
                            b.f(sharedPreferencesApi, obj, interfaceC2041d);
                            break;
                        case 5:
                            b.g(sharedPreferencesApi, obj, interfaceC2041d);
                            break;
                        case 6:
                            b.h(sharedPreferencesApi, obj, interfaceC2041d);
                            break;
                        case 7:
                            b.i(sharedPreferencesApi, obj, interfaceC2041d);
                            break;
                        default:
                            b.j(sharedPreferencesApi, obj, interfaceC2041d);
                            break;
                    }
                }
            });
        } else {
            c2042e8.b(null);
        }
        C2042e c2042e9 = new C2042e(jVar, AbstractC1414e.h("dev.flutter.pigeon.shared_preferences_android.SharedPreferencesApi.getAll", strConcat), a(), hVarMakeBackgroundTaskQueue);
        if (sharedPreferencesApi == null) {
            c2042e9.b(null);
        } else {
            final int i15 = 8;
            c2042e9.b(new InterfaceC2040c() { // from class: io.flutter.plugins.sharedpreferences.a
                @Override // pg.InterfaceC2040c
                public final void onMessage(Object obj, InterfaceC2041d interfaceC2041d) {
                    switch (i15) {
                        case 0:
                            b.b(sharedPreferencesApi, obj, interfaceC2041d);
                            break;
                        case 1:
                            b.c(sharedPreferencesApi, obj, interfaceC2041d);
                            break;
                        case 2:
                            b.d(sharedPreferencesApi, obj, interfaceC2041d);
                            break;
                        case 3:
                            b.e(sharedPreferencesApi, obj, interfaceC2041d);
                            break;
                        case 4:
                            b.f(sharedPreferencesApi, obj, interfaceC2041d);
                            break;
                        case 5:
                            b.g(sharedPreferencesApi, obj, interfaceC2041d);
                            break;
                        case 6:
                            b.h(sharedPreferencesApi, obj, interfaceC2041d);
                            break;
                        case 7:
                            b.i(sharedPreferencesApi, obj, interfaceC2041d);
                            break;
                        default:
                            b.j(sharedPreferencesApi, obj, interfaceC2041d);
                            break;
                    }
                }
            });
        }
    }
}
