package io.flutter.plugins.videoplayer;

import defpackage.AbstractC1414e;
import io.flutter.plugins.videoplayer.Messages;
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

    public static /* synthetic */ void b(Messages.AndroidVideoPlayerApi androidVideoPlayerApi, Object obj, InterfaceC2041d interfaceC2041d) {
        ArrayList<Object> arrayList = new ArrayList<>();
        try {
            androidVideoPlayerApi.initialize();
            arrayList.add(0, null);
        } catch (Throwable th2) {
            arrayList = Messages.wrapError(th2);
        }
        interfaceC2041d.reply(arrayList);
    }

    public static /* synthetic */ void c(Messages.AndroidVideoPlayerApi androidVideoPlayerApi, Object obj, InterfaceC2041d interfaceC2041d) {
        ArrayList<Object> arrayList = new ArrayList<>();
        try {
            arrayList.add(0, androidVideoPlayerApi.create((Messages.CreateMessage) ((ArrayList) obj).get(0)));
        } catch (Throwable th2) {
            arrayList = Messages.wrapError(th2);
        }
        interfaceC2041d.reply(arrayList);
    }

    public static /* synthetic */ void d(Messages.AndroidVideoPlayerApi androidVideoPlayerApi, Object obj, InterfaceC2041d interfaceC2041d) {
        ArrayList<Object> arrayList = new ArrayList<>();
        try {
            androidVideoPlayerApi.setMixWithOthers((Boolean) ((ArrayList) obj).get(0));
            arrayList.add(0, null);
        } catch (Throwable th2) {
            arrayList = Messages.wrapError(th2);
        }
        interfaceC2041d.reply(arrayList);
    }

    public static /* synthetic */ void e(Messages.AndroidVideoPlayerApi androidVideoPlayerApi, Object obj, InterfaceC2041d interfaceC2041d) {
        ArrayList<Object> arrayList = new ArrayList<>();
        try {
            androidVideoPlayerApi.dispose((Long) ((ArrayList) obj).get(0));
            arrayList.add(0, null);
        } catch (Throwable th2) {
            arrayList = Messages.wrapError(th2);
        }
        interfaceC2041d.reply(arrayList);
    }

    public static /* synthetic */ void f(Messages.AndroidVideoPlayerApi androidVideoPlayerApi, Object obj, InterfaceC2041d interfaceC2041d) {
        ArrayList<Object> arrayList = new ArrayList<>();
        ArrayList arrayList2 = (ArrayList) obj;
        try {
            androidVideoPlayerApi.setLooping((Long) arrayList2.get(0), (Boolean) arrayList2.get(1));
            arrayList.add(0, null);
        } catch (Throwable th2) {
            arrayList = Messages.wrapError(th2);
        }
        interfaceC2041d.reply(arrayList);
    }

    public static /* synthetic */ void g(Messages.AndroidVideoPlayerApi androidVideoPlayerApi, Object obj, InterfaceC2041d interfaceC2041d) {
        ArrayList<Object> arrayList = new ArrayList<>();
        ArrayList arrayList2 = (ArrayList) obj;
        try {
            androidVideoPlayerApi.setVolume((Long) arrayList2.get(0), (Double) arrayList2.get(1));
            arrayList.add(0, null);
        } catch (Throwable th2) {
            arrayList = Messages.wrapError(th2);
        }
        interfaceC2041d.reply(arrayList);
    }

    public static /* synthetic */ void h(Messages.AndroidVideoPlayerApi androidVideoPlayerApi, Object obj, InterfaceC2041d interfaceC2041d) {
        ArrayList<Object> arrayList = new ArrayList<>();
        ArrayList arrayList2 = (ArrayList) obj;
        try {
            androidVideoPlayerApi.setPlaybackSpeed((Long) arrayList2.get(0), (Double) arrayList2.get(1));
            arrayList.add(0, null);
        } catch (Throwable th2) {
            arrayList = Messages.wrapError(th2);
        }
        interfaceC2041d.reply(arrayList);
    }

    public static /* synthetic */ void i(Messages.AndroidVideoPlayerApi androidVideoPlayerApi, Object obj, InterfaceC2041d interfaceC2041d) {
        ArrayList<Object> arrayList = new ArrayList<>();
        try {
            androidVideoPlayerApi.play((Long) ((ArrayList) obj).get(0));
            arrayList.add(0, null);
        } catch (Throwable th2) {
            arrayList = Messages.wrapError(th2);
        }
        interfaceC2041d.reply(arrayList);
    }

    public static /* synthetic */ void j(Messages.AndroidVideoPlayerApi androidVideoPlayerApi, Object obj, InterfaceC2041d interfaceC2041d) {
        ArrayList<Object> arrayList = new ArrayList<>();
        try {
            arrayList.add(0, androidVideoPlayerApi.position((Long) ((ArrayList) obj).get(0)));
        } catch (Throwable th2) {
            arrayList = Messages.wrapError(th2);
        }
        interfaceC2041d.reply(arrayList);
    }

    public static /* synthetic */ void k(Messages.AndroidVideoPlayerApi androidVideoPlayerApi, Object obj, InterfaceC2041d interfaceC2041d) {
        ArrayList<Object> arrayList = new ArrayList<>();
        ArrayList arrayList2 = (ArrayList) obj;
        try {
            androidVideoPlayerApi.seekTo((Long) arrayList2.get(0), (Long) arrayList2.get(1));
            arrayList.add(0, null);
        } catch (Throwable th2) {
            arrayList = Messages.wrapError(th2);
        }
        interfaceC2041d.reply(arrayList);
    }

    public static /* synthetic */ void l(Messages.AndroidVideoPlayerApi androidVideoPlayerApi, Object obj, InterfaceC2041d interfaceC2041d) {
        ArrayList<Object> arrayList = new ArrayList<>();
        try {
            androidVideoPlayerApi.pause((Long) ((ArrayList) obj).get(0));
            arrayList.add(0, null);
        } catch (Throwable th2) {
            arrayList = Messages.wrapError(th2);
        }
        interfaceC2041d.reply(arrayList);
    }

    public static void m(j jVar, Messages.AndroidVideoPlayerApi androidVideoPlayerApi) {
        n(jVar, "", androidVideoPlayerApi);
    }

    public static void n(j jVar, String str, final Messages.AndroidVideoPlayerApi androidVideoPlayerApi) {
        String strConcat = str.isEmpty() ? "" : ".".concat(str);
        C2042e c2042e = new C2042e(jVar, AbstractC1414e.h("dev.flutter.pigeon.video_player_android.AndroidVideoPlayerApi.initialize", strConcat), a(), null);
        if (androidVideoPlayerApi != null) {
            final int i = 0;
            c2042e.b(new InterfaceC2040c() { // from class: io.flutter.plugins.videoplayer.a
                @Override // pg.InterfaceC2040c
                public final void onMessage(Object obj, InterfaceC2041d interfaceC2041d) {
                    switch (i) {
                        case 0:
                            b.b(androidVideoPlayerApi, obj, interfaceC2041d);
                            break;
                        case 1:
                            b.l(androidVideoPlayerApi, obj, interfaceC2041d);
                            break;
                        case 2:
                            b.d(androidVideoPlayerApi, obj, interfaceC2041d);
                            break;
                        case 3:
                            b.c(androidVideoPlayerApi, obj, interfaceC2041d);
                            break;
                        case 4:
                            b.e(androidVideoPlayerApi, obj, interfaceC2041d);
                            break;
                        case 5:
                            b.f(androidVideoPlayerApi, obj, interfaceC2041d);
                            break;
                        case 6:
                            b.g(androidVideoPlayerApi, obj, interfaceC2041d);
                            break;
                        case 7:
                            b.h(androidVideoPlayerApi, obj, interfaceC2041d);
                            break;
                        case 8:
                            b.i(androidVideoPlayerApi, obj, interfaceC2041d);
                            break;
                        case 9:
                            b.j(androidVideoPlayerApi, obj, interfaceC2041d);
                            break;
                        default:
                            b.k(androidVideoPlayerApi, obj, interfaceC2041d);
                            break;
                    }
                }
            });
        } else {
            c2042e.b(null);
        }
        C2042e c2042e2 = new C2042e(jVar, AbstractC1414e.h("dev.flutter.pigeon.video_player_android.AndroidVideoPlayerApi.create", strConcat), a(), null);
        if (androidVideoPlayerApi != null) {
            final int i4 = 3;
            c2042e2.b(new InterfaceC2040c() { // from class: io.flutter.plugins.videoplayer.a
                @Override // pg.InterfaceC2040c
                public final void onMessage(Object obj, InterfaceC2041d interfaceC2041d) {
                    switch (i4) {
                        case 0:
                            b.b(androidVideoPlayerApi, obj, interfaceC2041d);
                            break;
                        case 1:
                            b.l(androidVideoPlayerApi, obj, interfaceC2041d);
                            break;
                        case 2:
                            b.d(androidVideoPlayerApi, obj, interfaceC2041d);
                            break;
                        case 3:
                            b.c(androidVideoPlayerApi, obj, interfaceC2041d);
                            break;
                        case 4:
                            b.e(androidVideoPlayerApi, obj, interfaceC2041d);
                            break;
                        case 5:
                            b.f(androidVideoPlayerApi, obj, interfaceC2041d);
                            break;
                        case 6:
                            b.g(androidVideoPlayerApi, obj, interfaceC2041d);
                            break;
                        case 7:
                            b.h(androidVideoPlayerApi, obj, interfaceC2041d);
                            break;
                        case 8:
                            b.i(androidVideoPlayerApi, obj, interfaceC2041d);
                            break;
                        case 9:
                            b.j(androidVideoPlayerApi, obj, interfaceC2041d);
                            break;
                        default:
                            b.k(androidVideoPlayerApi, obj, interfaceC2041d);
                            break;
                    }
                }
            });
        } else {
            c2042e2.b(null);
        }
        C2042e c2042e3 = new C2042e(jVar, AbstractC1414e.h("dev.flutter.pigeon.video_player_android.AndroidVideoPlayerApi.dispose", strConcat), a(), null);
        if (androidVideoPlayerApi != null) {
            final int i6 = 4;
            c2042e3.b(new InterfaceC2040c() { // from class: io.flutter.plugins.videoplayer.a
                @Override // pg.InterfaceC2040c
                public final void onMessage(Object obj, InterfaceC2041d interfaceC2041d) {
                    switch (i6) {
                        case 0:
                            b.b(androidVideoPlayerApi, obj, interfaceC2041d);
                            break;
                        case 1:
                            b.l(androidVideoPlayerApi, obj, interfaceC2041d);
                            break;
                        case 2:
                            b.d(androidVideoPlayerApi, obj, interfaceC2041d);
                            break;
                        case 3:
                            b.c(androidVideoPlayerApi, obj, interfaceC2041d);
                            break;
                        case 4:
                            b.e(androidVideoPlayerApi, obj, interfaceC2041d);
                            break;
                        case 5:
                            b.f(androidVideoPlayerApi, obj, interfaceC2041d);
                            break;
                        case 6:
                            b.g(androidVideoPlayerApi, obj, interfaceC2041d);
                            break;
                        case 7:
                            b.h(androidVideoPlayerApi, obj, interfaceC2041d);
                            break;
                        case 8:
                            b.i(androidVideoPlayerApi, obj, interfaceC2041d);
                            break;
                        case 9:
                            b.j(androidVideoPlayerApi, obj, interfaceC2041d);
                            break;
                        default:
                            b.k(androidVideoPlayerApi, obj, interfaceC2041d);
                            break;
                    }
                }
            });
        } else {
            c2042e3.b(null);
        }
        C2042e c2042e4 = new C2042e(jVar, AbstractC1414e.h("dev.flutter.pigeon.video_player_android.AndroidVideoPlayerApi.setLooping", strConcat), a(), null);
        if (androidVideoPlayerApi != null) {
            final int i10 = 5;
            c2042e4.b(new InterfaceC2040c() { // from class: io.flutter.plugins.videoplayer.a
                @Override // pg.InterfaceC2040c
                public final void onMessage(Object obj, InterfaceC2041d interfaceC2041d) {
                    switch (i10) {
                        case 0:
                            b.b(androidVideoPlayerApi, obj, interfaceC2041d);
                            break;
                        case 1:
                            b.l(androidVideoPlayerApi, obj, interfaceC2041d);
                            break;
                        case 2:
                            b.d(androidVideoPlayerApi, obj, interfaceC2041d);
                            break;
                        case 3:
                            b.c(androidVideoPlayerApi, obj, interfaceC2041d);
                            break;
                        case 4:
                            b.e(androidVideoPlayerApi, obj, interfaceC2041d);
                            break;
                        case 5:
                            b.f(androidVideoPlayerApi, obj, interfaceC2041d);
                            break;
                        case 6:
                            b.g(androidVideoPlayerApi, obj, interfaceC2041d);
                            break;
                        case 7:
                            b.h(androidVideoPlayerApi, obj, interfaceC2041d);
                            break;
                        case 8:
                            b.i(androidVideoPlayerApi, obj, interfaceC2041d);
                            break;
                        case 9:
                            b.j(androidVideoPlayerApi, obj, interfaceC2041d);
                            break;
                        default:
                            b.k(androidVideoPlayerApi, obj, interfaceC2041d);
                            break;
                    }
                }
            });
        } else {
            c2042e4.b(null);
        }
        C2042e c2042e5 = new C2042e(jVar, AbstractC1414e.h("dev.flutter.pigeon.video_player_android.AndroidVideoPlayerApi.setVolume", strConcat), a(), null);
        if (androidVideoPlayerApi != null) {
            final int i11 = 6;
            c2042e5.b(new InterfaceC2040c() { // from class: io.flutter.plugins.videoplayer.a
                @Override // pg.InterfaceC2040c
                public final void onMessage(Object obj, InterfaceC2041d interfaceC2041d) {
                    switch (i11) {
                        case 0:
                            b.b(androidVideoPlayerApi, obj, interfaceC2041d);
                            break;
                        case 1:
                            b.l(androidVideoPlayerApi, obj, interfaceC2041d);
                            break;
                        case 2:
                            b.d(androidVideoPlayerApi, obj, interfaceC2041d);
                            break;
                        case 3:
                            b.c(androidVideoPlayerApi, obj, interfaceC2041d);
                            break;
                        case 4:
                            b.e(androidVideoPlayerApi, obj, interfaceC2041d);
                            break;
                        case 5:
                            b.f(androidVideoPlayerApi, obj, interfaceC2041d);
                            break;
                        case 6:
                            b.g(androidVideoPlayerApi, obj, interfaceC2041d);
                            break;
                        case 7:
                            b.h(androidVideoPlayerApi, obj, interfaceC2041d);
                            break;
                        case 8:
                            b.i(androidVideoPlayerApi, obj, interfaceC2041d);
                            break;
                        case 9:
                            b.j(androidVideoPlayerApi, obj, interfaceC2041d);
                            break;
                        default:
                            b.k(androidVideoPlayerApi, obj, interfaceC2041d);
                            break;
                    }
                }
            });
        } else {
            c2042e5.b(null);
        }
        C2042e c2042e6 = new C2042e(jVar, AbstractC1414e.h("dev.flutter.pigeon.video_player_android.AndroidVideoPlayerApi.setPlaybackSpeed", strConcat), a(), null);
        if (androidVideoPlayerApi != null) {
            final int i12 = 7;
            c2042e6.b(new InterfaceC2040c() { // from class: io.flutter.plugins.videoplayer.a
                @Override // pg.InterfaceC2040c
                public final void onMessage(Object obj, InterfaceC2041d interfaceC2041d) {
                    switch (i12) {
                        case 0:
                            b.b(androidVideoPlayerApi, obj, interfaceC2041d);
                            break;
                        case 1:
                            b.l(androidVideoPlayerApi, obj, interfaceC2041d);
                            break;
                        case 2:
                            b.d(androidVideoPlayerApi, obj, interfaceC2041d);
                            break;
                        case 3:
                            b.c(androidVideoPlayerApi, obj, interfaceC2041d);
                            break;
                        case 4:
                            b.e(androidVideoPlayerApi, obj, interfaceC2041d);
                            break;
                        case 5:
                            b.f(androidVideoPlayerApi, obj, interfaceC2041d);
                            break;
                        case 6:
                            b.g(androidVideoPlayerApi, obj, interfaceC2041d);
                            break;
                        case 7:
                            b.h(androidVideoPlayerApi, obj, interfaceC2041d);
                            break;
                        case 8:
                            b.i(androidVideoPlayerApi, obj, interfaceC2041d);
                            break;
                        case 9:
                            b.j(androidVideoPlayerApi, obj, interfaceC2041d);
                            break;
                        default:
                            b.k(androidVideoPlayerApi, obj, interfaceC2041d);
                            break;
                    }
                }
            });
        } else {
            c2042e6.b(null);
        }
        C2042e c2042e7 = new C2042e(jVar, AbstractC1414e.h("dev.flutter.pigeon.video_player_android.AndroidVideoPlayerApi.play", strConcat), a(), null);
        if (androidVideoPlayerApi != null) {
            final int i13 = 8;
            c2042e7.b(new InterfaceC2040c() { // from class: io.flutter.plugins.videoplayer.a
                @Override // pg.InterfaceC2040c
                public final void onMessage(Object obj, InterfaceC2041d interfaceC2041d) {
                    switch (i13) {
                        case 0:
                            b.b(androidVideoPlayerApi, obj, interfaceC2041d);
                            break;
                        case 1:
                            b.l(androidVideoPlayerApi, obj, interfaceC2041d);
                            break;
                        case 2:
                            b.d(androidVideoPlayerApi, obj, interfaceC2041d);
                            break;
                        case 3:
                            b.c(androidVideoPlayerApi, obj, interfaceC2041d);
                            break;
                        case 4:
                            b.e(androidVideoPlayerApi, obj, interfaceC2041d);
                            break;
                        case 5:
                            b.f(androidVideoPlayerApi, obj, interfaceC2041d);
                            break;
                        case 6:
                            b.g(androidVideoPlayerApi, obj, interfaceC2041d);
                            break;
                        case 7:
                            b.h(androidVideoPlayerApi, obj, interfaceC2041d);
                            break;
                        case 8:
                            b.i(androidVideoPlayerApi, obj, interfaceC2041d);
                            break;
                        case 9:
                            b.j(androidVideoPlayerApi, obj, interfaceC2041d);
                            break;
                        default:
                            b.k(androidVideoPlayerApi, obj, interfaceC2041d);
                            break;
                    }
                }
            });
        } else {
            c2042e7.b(null);
        }
        C2042e c2042e8 = new C2042e(jVar, AbstractC1414e.h("dev.flutter.pigeon.video_player_android.AndroidVideoPlayerApi.position", strConcat), a(), null);
        if (androidVideoPlayerApi != null) {
            final int i14 = 9;
            c2042e8.b(new InterfaceC2040c() { // from class: io.flutter.plugins.videoplayer.a
                @Override // pg.InterfaceC2040c
                public final void onMessage(Object obj, InterfaceC2041d interfaceC2041d) {
                    switch (i14) {
                        case 0:
                            b.b(androidVideoPlayerApi, obj, interfaceC2041d);
                            break;
                        case 1:
                            b.l(androidVideoPlayerApi, obj, interfaceC2041d);
                            break;
                        case 2:
                            b.d(androidVideoPlayerApi, obj, interfaceC2041d);
                            break;
                        case 3:
                            b.c(androidVideoPlayerApi, obj, interfaceC2041d);
                            break;
                        case 4:
                            b.e(androidVideoPlayerApi, obj, interfaceC2041d);
                            break;
                        case 5:
                            b.f(androidVideoPlayerApi, obj, interfaceC2041d);
                            break;
                        case 6:
                            b.g(androidVideoPlayerApi, obj, interfaceC2041d);
                            break;
                        case 7:
                            b.h(androidVideoPlayerApi, obj, interfaceC2041d);
                            break;
                        case 8:
                            b.i(androidVideoPlayerApi, obj, interfaceC2041d);
                            break;
                        case 9:
                            b.j(androidVideoPlayerApi, obj, interfaceC2041d);
                            break;
                        default:
                            b.k(androidVideoPlayerApi, obj, interfaceC2041d);
                            break;
                    }
                }
            });
        } else {
            c2042e8.b(null);
        }
        C2042e c2042e9 = new C2042e(jVar, AbstractC1414e.h("dev.flutter.pigeon.video_player_android.AndroidVideoPlayerApi.seekTo", strConcat), a(), null);
        if (androidVideoPlayerApi != null) {
            final int i15 = 10;
            c2042e9.b(new InterfaceC2040c() { // from class: io.flutter.plugins.videoplayer.a
                @Override // pg.InterfaceC2040c
                public final void onMessage(Object obj, InterfaceC2041d interfaceC2041d) {
                    switch (i15) {
                        case 0:
                            b.b(androidVideoPlayerApi, obj, interfaceC2041d);
                            break;
                        case 1:
                            b.l(androidVideoPlayerApi, obj, interfaceC2041d);
                            break;
                        case 2:
                            b.d(androidVideoPlayerApi, obj, interfaceC2041d);
                            break;
                        case 3:
                            b.c(androidVideoPlayerApi, obj, interfaceC2041d);
                            break;
                        case 4:
                            b.e(androidVideoPlayerApi, obj, interfaceC2041d);
                            break;
                        case 5:
                            b.f(androidVideoPlayerApi, obj, interfaceC2041d);
                            break;
                        case 6:
                            b.g(androidVideoPlayerApi, obj, interfaceC2041d);
                            break;
                        case 7:
                            b.h(androidVideoPlayerApi, obj, interfaceC2041d);
                            break;
                        case 8:
                            b.i(androidVideoPlayerApi, obj, interfaceC2041d);
                            break;
                        case 9:
                            b.j(androidVideoPlayerApi, obj, interfaceC2041d);
                            break;
                        default:
                            b.k(androidVideoPlayerApi, obj, interfaceC2041d);
                            break;
                    }
                }
            });
        } else {
            c2042e9.b(null);
        }
        C2042e c2042e10 = new C2042e(jVar, AbstractC1414e.h("dev.flutter.pigeon.video_player_android.AndroidVideoPlayerApi.pause", strConcat), a(), null);
        if (androidVideoPlayerApi != null) {
            final int i16 = 1;
            c2042e10.b(new InterfaceC2040c() { // from class: io.flutter.plugins.videoplayer.a
                @Override // pg.InterfaceC2040c
                public final void onMessage(Object obj, InterfaceC2041d interfaceC2041d) {
                    switch (i16) {
                        case 0:
                            b.b(androidVideoPlayerApi, obj, interfaceC2041d);
                            break;
                        case 1:
                            b.l(androidVideoPlayerApi, obj, interfaceC2041d);
                            break;
                        case 2:
                            b.d(androidVideoPlayerApi, obj, interfaceC2041d);
                            break;
                        case 3:
                            b.c(androidVideoPlayerApi, obj, interfaceC2041d);
                            break;
                        case 4:
                            b.e(androidVideoPlayerApi, obj, interfaceC2041d);
                            break;
                        case 5:
                            b.f(androidVideoPlayerApi, obj, interfaceC2041d);
                            break;
                        case 6:
                            b.g(androidVideoPlayerApi, obj, interfaceC2041d);
                            break;
                        case 7:
                            b.h(androidVideoPlayerApi, obj, interfaceC2041d);
                            break;
                        case 8:
                            b.i(androidVideoPlayerApi, obj, interfaceC2041d);
                            break;
                        case 9:
                            b.j(androidVideoPlayerApi, obj, interfaceC2041d);
                            break;
                        default:
                            b.k(androidVideoPlayerApi, obj, interfaceC2041d);
                            break;
                    }
                }
            });
        } else {
            c2042e10.b(null);
        }
        C2042e c2042e11 = new C2042e(jVar, AbstractC1414e.h("dev.flutter.pigeon.video_player_android.AndroidVideoPlayerApi.setMixWithOthers", strConcat), a(), null);
        if (androidVideoPlayerApi == null) {
            c2042e11.b(null);
        } else {
            final int i17 = 2;
            c2042e11.b(new InterfaceC2040c() { // from class: io.flutter.plugins.videoplayer.a
                @Override // pg.InterfaceC2040c
                public final void onMessage(Object obj, InterfaceC2041d interfaceC2041d) {
                    switch (i17) {
                        case 0:
                            b.b(androidVideoPlayerApi, obj, interfaceC2041d);
                            break;
                        case 1:
                            b.l(androidVideoPlayerApi, obj, interfaceC2041d);
                            break;
                        case 2:
                            b.d(androidVideoPlayerApi, obj, interfaceC2041d);
                            break;
                        case 3:
                            b.c(androidVideoPlayerApi, obj, interfaceC2041d);
                            break;
                        case 4:
                            b.e(androidVideoPlayerApi, obj, interfaceC2041d);
                            break;
                        case 5:
                            b.f(androidVideoPlayerApi, obj, interfaceC2041d);
                            break;
                        case 6:
                            b.g(androidVideoPlayerApi, obj, interfaceC2041d);
                            break;
                        case 7:
                            b.h(androidVideoPlayerApi, obj, interfaceC2041d);
                            break;
                        case 8:
                            b.i(androidVideoPlayerApi, obj, interfaceC2041d);
                            break;
                        case 9:
                            b.j(androidVideoPlayerApi, obj, interfaceC2041d);
                            break;
                        default:
                            b.k(androidVideoPlayerApi, obj, interfaceC2041d);
                            break;
                    }
                }
            });
        }
    }
}
