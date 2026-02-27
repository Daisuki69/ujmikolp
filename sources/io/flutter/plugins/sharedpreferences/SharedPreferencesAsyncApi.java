package io.flutter.plugins.sharedpreferences;

import A5.j;
import bj.C1034e;
import bj.InterfaceC1033d;
import cj.r;
import defpackage.AbstractC1414e;
import e2.C1421c;
import io.flutter.plugins.sharedpreferences.SharedPreferencesAsyncApi;
import java.util.List;
import java.util.Map;
import pg.C2042e;
import pg.InterfaceC2040c;
import pg.InterfaceC2041d;
import pg.h;
import pg.q;

/* JADX INFO: loaded from: classes4.dex */
public interface SharedPreferencesAsyncApi {
    public static final Companion Companion = Companion.$$INSTANCE;

    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();
        private static final InterfaceC1033d codec$delegate = C1034e.b(new j(29));

        private Companion() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final MessagesAsyncPigeonCodec codec_delegate$lambda$0() {
            return new MessagesAsyncPigeonCodec();
        }

        public static /* synthetic */ void setUp$default(Companion companion, pg.j jVar, SharedPreferencesAsyncApi sharedPreferencesAsyncApi, String str, int i, Object obj) {
            if ((i & 4) != 0) {
                str = "";
            }
            companion.setUp(jVar, sharedPreferencesAsyncApi, str);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void setUp$lambda$10$lambda$9(SharedPreferencesAsyncApi sharedPreferencesAsyncApi, Object obj, InterfaceC2041d reply) {
            List listWrapError;
            kotlin.jvm.internal.j.g(reply, "reply");
            kotlin.jvm.internal.j.e(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
            List list = (List) obj;
            Object obj2 = list.get(0);
            kotlin.jvm.internal.j.e(obj2, "null cannot be cast to non-null type kotlin.String");
            String str = (String) obj2;
            Object obj3 = list.get(1);
            kotlin.jvm.internal.j.e(obj3, "null cannot be cast to non-null type kotlin.String");
            String str2 = (String) obj3;
            Object obj4 = list.get(2);
            kotlin.jvm.internal.j.e(obj4, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
            try {
                sharedPreferencesAsyncApi.setEncodedStringList(str, str2, (SharedPreferencesPigeonOptions) obj4);
                listWrapError = r.c(null);
            } catch (Throwable th2) {
                listWrapError = MessagesAsync_gKt.wrapError(th2);
            }
            reply.reply(listWrapError);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void setUp$lambda$12$lambda$11(SharedPreferencesAsyncApi sharedPreferencesAsyncApi, Object obj, InterfaceC2041d reply) {
            List listWrapError;
            kotlin.jvm.internal.j.g(reply, "reply");
            kotlin.jvm.internal.j.e(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
            List list = (List) obj;
            Object obj2 = list.get(0);
            kotlin.jvm.internal.j.e(obj2, "null cannot be cast to non-null type kotlin.String");
            String str = (String) obj2;
            Object obj3 = list.get(1);
            kotlin.jvm.internal.j.e(obj3, "null cannot be cast to non-null type kotlin.collections.List<kotlin.String>");
            List<String> list2 = (List) obj3;
            Object obj4 = list.get(2);
            kotlin.jvm.internal.j.e(obj4, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
            try {
                sharedPreferencesAsyncApi.setDeprecatedStringList(str, list2, (SharedPreferencesPigeonOptions) obj4);
                listWrapError = r.c(null);
            } catch (Throwable th2) {
                listWrapError = MessagesAsync_gKt.wrapError(th2);
            }
            reply.reply(listWrapError);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void setUp$lambda$14$lambda$13(SharedPreferencesAsyncApi sharedPreferencesAsyncApi, Object obj, InterfaceC2041d reply) {
            List listWrapError;
            kotlin.jvm.internal.j.g(reply, "reply");
            kotlin.jvm.internal.j.e(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
            List list = (List) obj;
            Object obj2 = list.get(0);
            kotlin.jvm.internal.j.e(obj2, "null cannot be cast to non-null type kotlin.String");
            String str = (String) obj2;
            Object obj3 = list.get(1);
            kotlin.jvm.internal.j.e(obj3, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
            try {
                listWrapError = r.c(sharedPreferencesAsyncApi.getString(str, (SharedPreferencesPigeonOptions) obj3));
            } catch (Throwable th2) {
                listWrapError = MessagesAsync_gKt.wrapError(th2);
            }
            reply.reply(listWrapError);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void setUp$lambda$16$lambda$15(SharedPreferencesAsyncApi sharedPreferencesAsyncApi, Object obj, InterfaceC2041d reply) {
            List listWrapError;
            kotlin.jvm.internal.j.g(reply, "reply");
            kotlin.jvm.internal.j.e(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
            List list = (List) obj;
            Object obj2 = list.get(0);
            kotlin.jvm.internal.j.e(obj2, "null cannot be cast to non-null type kotlin.String");
            String str = (String) obj2;
            Object obj3 = list.get(1);
            kotlin.jvm.internal.j.e(obj3, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
            try {
                listWrapError = r.c(sharedPreferencesAsyncApi.getBool(str, (SharedPreferencesPigeonOptions) obj3));
            } catch (Throwable th2) {
                listWrapError = MessagesAsync_gKt.wrapError(th2);
            }
            reply.reply(listWrapError);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void setUp$lambda$18$lambda$17(SharedPreferencesAsyncApi sharedPreferencesAsyncApi, Object obj, InterfaceC2041d reply) {
            List listWrapError;
            kotlin.jvm.internal.j.g(reply, "reply");
            kotlin.jvm.internal.j.e(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
            List list = (List) obj;
            Object obj2 = list.get(0);
            kotlin.jvm.internal.j.e(obj2, "null cannot be cast to non-null type kotlin.String");
            String str = (String) obj2;
            Object obj3 = list.get(1);
            kotlin.jvm.internal.j.e(obj3, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
            try {
                listWrapError = r.c(sharedPreferencesAsyncApi.getDouble(str, (SharedPreferencesPigeonOptions) obj3));
            } catch (Throwable th2) {
                listWrapError = MessagesAsync_gKt.wrapError(th2);
            }
            reply.reply(listWrapError);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void setUp$lambda$2$lambda$1(SharedPreferencesAsyncApi sharedPreferencesAsyncApi, Object obj, InterfaceC2041d reply) {
            List listWrapError;
            kotlin.jvm.internal.j.g(reply, "reply");
            kotlin.jvm.internal.j.e(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
            List list = (List) obj;
            Object obj2 = list.get(0);
            kotlin.jvm.internal.j.e(obj2, "null cannot be cast to non-null type kotlin.String");
            String str = (String) obj2;
            Object obj3 = list.get(1);
            kotlin.jvm.internal.j.e(obj3, "null cannot be cast to non-null type kotlin.Boolean");
            boolean zBooleanValue = ((Boolean) obj3).booleanValue();
            Object obj4 = list.get(2);
            kotlin.jvm.internal.j.e(obj4, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
            try {
                sharedPreferencesAsyncApi.setBool(str, zBooleanValue, (SharedPreferencesPigeonOptions) obj4);
                listWrapError = r.c(null);
            } catch (Throwable th2) {
                listWrapError = MessagesAsync_gKt.wrapError(th2);
            }
            reply.reply(listWrapError);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void setUp$lambda$20$lambda$19(SharedPreferencesAsyncApi sharedPreferencesAsyncApi, Object obj, InterfaceC2041d reply) {
            List listWrapError;
            kotlin.jvm.internal.j.g(reply, "reply");
            kotlin.jvm.internal.j.e(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
            List list = (List) obj;
            Object obj2 = list.get(0);
            kotlin.jvm.internal.j.e(obj2, "null cannot be cast to non-null type kotlin.String");
            String str = (String) obj2;
            Object obj3 = list.get(1);
            kotlin.jvm.internal.j.e(obj3, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
            try {
                listWrapError = r.c(sharedPreferencesAsyncApi.getInt(str, (SharedPreferencesPigeonOptions) obj3));
            } catch (Throwable th2) {
                listWrapError = MessagesAsync_gKt.wrapError(th2);
            }
            reply.reply(listWrapError);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void setUp$lambda$22$lambda$21(SharedPreferencesAsyncApi sharedPreferencesAsyncApi, Object obj, InterfaceC2041d reply) {
            List listWrapError;
            kotlin.jvm.internal.j.g(reply, "reply");
            kotlin.jvm.internal.j.e(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
            List list = (List) obj;
            Object obj2 = list.get(0);
            kotlin.jvm.internal.j.e(obj2, "null cannot be cast to non-null type kotlin.String");
            String str = (String) obj2;
            Object obj3 = list.get(1);
            kotlin.jvm.internal.j.e(obj3, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
            try {
                listWrapError = r.c(sharedPreferencesAsyncApi.getPlatformEncodedStringList(str, (SharedPreferencesPigeonOptions) obj3));
            } catch (Throwable th2) {
                listWrapError = MessagesAsync_gKt.wrapError(th2);
            }
            reply.reply(listWrapError);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void setUp$lambda$24$lambda$23(SharedPreferencesAsyncApi sharedPreferencesAsyncApi, Object obj, InterfaceC2041d reply) {
            List listWrapError;
            kotlin.jvm.internal.j.g(reply, "reply");
            kotlin.jvm.internal.j.e(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
            List list = (List) obj;
            Object obj2 = list.get(0);
            kotlin.jvm.internal.j.e(obj2, "null cannot be cast to non-null type kotlin.String");
            String str = (String) obj2;
            Object obj3 = list.get(1);
            kotlin.jvm.internal.j.e(obj3, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
            try {
                listWrapError = r.c(sharedPreferencesAsyncApi.getStringList(str, (SharedPreferencesPigeonOptions) obj3));
            } catch (Throwable th2) {
                listWrapError = MessagesAsync_gKt.wrapError(th2);
            }
            reply.reply(listWrapError);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void setUp$lambda$26$lambda$25(SharedPreferencesAsyncApi sharedPreferencesAsyncApi, Object obj, InterfaceC2041d reply) {
            List listWrapError;
            kotlin.jvm.internal.j.g(reply, "reply");
            kotlin.jvm.internal.j.e(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
            List list = (List) obj;
            List<String> list2 = (List) list.get(0);
            Object obj2 = list.get(1);
            kotlin.jvm.internal.j.e(obj2, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
            try {
                sharedPreferencesAsyncApi.clear(list2, (SharedPreferencesPigeonOptions) obj2);
                listWrapError = r.c(null);
            } catch (Throwable th2) {
                listWrapError = MessagesAsync_gKt.wrapError(th2);
            }
            reply.reply(listWrapError);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void setUp$lambda$28$lambda$27(SharedPreferencesAsyncApi sharedPreferencesAsyncApi, Object obj, InterfaceC2041d reply) {
            List listWrapError;
            kotlin.jvm.internal.j.g(reply, "reply");
            kotlin.jvm.internal.j.e(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
            List list = (List) obj;
            List<String> list2 = (List) list.get(0);
            Object obj2 = list.get(1);
            kotlin.jvm.internal.j.e(obj2, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
            try {
                listWrapError = r.c(sharedPreferencesAsyncApi.getAll(list2, (SharedPreferencesPigeonOptions) obj2));
            } catch (Throwable th2) {
                listWrapError = MessagesAsync_gKt.wrapError(th2);
            }
            reply.reply(listWrapError);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void setUp$lambda$30$lambda$29(SharedPreferencesAsyncApi sharedPreferencesAsyncApi, Object obj, InterfaceC2041d reply) {
            List listWrapError;
            kotlin.jvm.internal.j.g(reply, "reply");
            kotlin.jvm.internal.j.e(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
            List list = (List) obj;
            List<String> list2 = (List) list.get(0);
            Object obj2 = list.get(1);
            kotlin.jvm.internal.j.e(obj2, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
            try {
                listWrapError = r.c(sharedPreferencesAsyncApi.getKeys(list2, (SharedPreferencesPigeonOptions) obj2));
            } catch (Throwable th2) {
                listWrapError = MessagesAsync_gKt.wrapError(th2);
            }
            reply.reply(listWrapError);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void setUp$lambda$4$lambda$3(SharedPreferencesAsyncApi sharedPreferencesAsyncApi, Object obj, InterfaceC2041d reply) {
            List listWrapError;
            kotlin.jvm.internal.j.g(reply, "reply");
            kotlin.jvm.internal.j.e(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
            List list = (List) obj;
            Object obj2 = list.get(0);
            kotlin.jvm.internal.j.e(obj2, "null cannot be cast to non-null type kotlin.String");
            String str = (String) obj2;
            Object obj3 = list.get(1);
            kotlin.jvm.internal.j.e(obj3, "null cannot be cast to non-null type kotlin.String");
            String str2 = (String) obj3;
            Object obj4 = list.get(2);
            kotlin.jvm.internal.j.e(obj4, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
            try {
                sharedPreferencesAsyncApi.setString(str, str2, (SharedPreferencesPigeonOptions) obj4);
                listWrapError = r.c(null);
            } catch (Throwable th2) {
                listWrapError = MessagesAsync_gKt.wrapError(th2);
            }
            reply.reply(listWrapError);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void setUp$lambda$6$lambda$5(SharedPreferencesAsyncApi sharedPreferencesAsyncApi, Object obj, InterfaceC2041d reply) {
            List listWrapError;
            kotlin.jvm.internal.j.g(reply, "reply");
            kotlin.jvm.internal.j.e(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
            List list = (List) obj;
            Object obj2 = list.get(0);
            kotlin.jvm.internal.j.e(obj2, "null cannot be cast to non-null type kotlin.String");
            String str = (String) obj2;
            Object obj3 = list.get(1);
            kotlin.jvm.internal.j.e(obj3, "null cannot be cast to non-null type kotlin.Long");
            long jLongValue = ((Long) obj3).longValue();
            Object obj4 = list.get(2);
            kotlin.jvm.internal.j.e(obj4, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
            try {
                sharedPreferencesAsyncApi.setInt(str, jLongValue, (SharedPreferencesPigeonOptions) obj4);
                listWrapError = r.c(null);
            } catch (Throwable th2) {
                listWrapError = MessagesAsync_gKt.wrapError(th2);
            }
            reply.reply(listWrapError);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void setUp$lambda$8$lambda$7(SharedPreferencesAsyncApi sharedPreferencesAsyncApi, Object obj, InterfaceC2041d reply) {
            List listWrapError;
            kotlin.jvm.internal.j.g(reply, "reply");
            kotlin.jvm.internal.j.e(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
            List list = (List) obj;
            Object obj2 = list.get(0);
            kotlin.jvm.internal.j.e(obj2, "null cannot be cast to non-null type kotlin.String");
            String str = (String) obj2;
            Object obj3 = list.get(1);
            kotlin.jvm.internal.j.e(obj3, "null cannot be cast to non-null type kotlin.Double");
            double dDoubleValue = ((Double) obj3).doubleValue();
            Object obj4 = list.get(2);
            kotlin.jvm.internal.j.e(obj4, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
            try {
                sharedPreferencesAsyncApi.setDouble(str, dDoubleValue, (SharedPreferencesPigeonOptions) obj4);
                listWrapError = r.c(null);
            } catch (Throwable th2) {
                listWrapError = MessagesAsync_gKt.wrapError(th2);
            }
            reply.reply(listWrapError);
        }

        public final q getCodec() {
            return (q) codec$delegate.getValue();
        }

        public final void setUp(pg.j binaryMessenger, SharedPreferencesAsyncApi sharedPreferencesAsyncApi) {
            kotlin.jvm.internal.j.g(binaryMessenger, "binaryMessenger");
            setUp$default(this, binaryMessenger, sharedPreferencesAsyncApi, null, 4, null);
        }

        public final void setUp(pg.j binaryMessenger, final SharedPreferencesAsyncApi sharedPreferencesAsyncApi, String messageChannelSuffix) {
            kotlin.jvm.internal.j.g(binaryMessenger, "binaryMessenger");
            kotlin.jvm.internal.j.g(messageChannelSuffix, "messageChannelSuffix");
            String strConcat = messageChannelSuffix.length() > 0 ? ".".concat(messageChannelSuffix) : "";
            h hVarMakeBackgroundTaskQueue = binaryMessenger.makeBackgroundTaskQueue();
            C2042e c2042e = new C2042e(binaryMessenger, AbstractC1414e.h("dev.flutter.pigeon.shared_preferences_android.SharedPreferencesAsyncApi.setBool", strConcat), getCodec(), hVarMakeBackgroundTaskQueue);
            if (sharedPreferencesAsyncApi != null) {
                final int i = 0;
                c2042e.b(new InterfaceC2040c() { // from class: io.flutter.plugins.sharedpreferences.c
                    @Override // pg.InterfaceC2040c
                    public final void onMessage(Object obj, InterfaceC2041d interfaceC2041d) {
                        switch (i) {
                            case 0:
                                SharedPreferencesAsyncApi.Companion.setUp$lambda$2$lambda$1(sharedPreferencesAsyncApi, obj, (C1421c) interfaceC2041d);
                                break;
                            case 1:
                                SharedPreferencesAsyncApi.Companion.setUp$lambda$12$lambda$11(sharedPreferencesAsyncApi, obj, (C1421c) interfaceC2041d);
                                break;
                            case 2:
                                SharedPreferencesAsyncApi.Companion.setUp$lambda$14$lambda$13(sharedPreferencesAsyncApi, obj, (C1421c) interfaceC2041d);
                                break;
                            case 3:
                                SharedPreferencesAsyncApi.Companion.setUp$lambda$16$lambda$15(sharedPreferencesAsyncApi, obj, (C1421c) interfaceC2041d);
                                break;
                            case 4:
                                SharedPreferencesAsyncApi.Companion.setUp$lambda$18$lambda$17(sharedPreferencesAsyncApi, obj, (C1421c) interfaceC2041d);
                                break;
                            case 5:
                                SharedPreferencesAsyncApi.Companion.setUp$lambda$20$lambda$19(sharedPreferencesAsyncApi, obj, (C1421c) interfaceC2041d);
                                break;
                            case 6:
                                SharedPreferencesAsyncApi.Companion.setUp$lambda$22$lambda$21(sharedPreferencesAsyncApi, obj, (C1421c) interfaceC2041d);
                                break;
                            case 7:
                                SharedPreferencesAsyncApi.Companion.setUp$lambda$24$lambda$23(sharedPreferencesAsyncApi, obj, (C1421c) interfaceC2041d);
                                break;
                            case 8:
                                SharedPreferencesAsyncApi.Companion.setUp$lambda$26$lambda$25(sharedPreferencesAsyncApi, obj, (C1421c) interfaceC2041d);
                                break;
                            case 9:
                                SharedPreferencesAsyncApi.Companion.setUp$lambda$28$lambda$27(sharedPreferencesAsyncApi, obj, (C1421c) interfaceC2041d);
                                break;
                            case 10:
                                SharedPreferencesAsyncApi.Companion.setUp$lambda$30$lambda$29(sharedPreferencesAsyncApi, obj, (C1421c) interfaceC2041d);
                                break;
                            case 11:
                                SharedPreferencesAsyncApi.Companion.setUp$lambda$4$lambda$3(sharedPreferencesAsyncApi, obj, (C1421c) interfaceC2041d);
                                break;
                            case 12:
                                SharedPreferencesAsyncApi.Companion.setUp$lambda$6$lambda$5(sharedPreferencesAsyncApi, obj, (C1421c) interfaceC2041d);
                                break;
                            case 13:
                                SharedPreferencesAsyncApi.Companion.setUp$lambda$8$lambda$7(sharedPreferencesAsyncApi, obj, (C1421c) interfaceC2041d);
                                break;
                            default:
                                SharedPreferencesAsyncApi.Companion.setUp$lambda$10$lambda$9(sharedPreferencesAsyncApi, obj, (C1421c) interfaceC2041d);
                                break;
                        }
                    }
                });
            } else {
                c2042e.b(null);
            }
            C2042e c2042e2 = new C2042e(binaryMessenger, AbstractC1414e.h("dev.flutter.pigeon.shared_preferences_android.SharedPreferencesAsyncApi.setString", strConcat), getCodec(), hVarMakeBackgroundTaskQueue);
            if (sharedPreferencesAsyncApi != null) {
                final int i4 = 11;
                c2042e2.b(new InterfaceC2040c() { // from class: io.flutter.plugins.sharedpreferences.c
                    @Override // pg.InterfaceC2040c
                    public final void onMessage(Object obj, InterfaceC2041d interfaceC2041d) {
                        switch (i4) {
                            case 0:
                                SharedPreferencesAsyncApi.Companion.setUp$lambda$2$lambda$1(sharedPreferencesAsyncApi, obj, (C1421c) interfaceC2041d);
                                break;
                            case 1:
                                SharedPreferencesAsyncApi.Companion.setUp$lambda$12$lambda$11(sharedPreferencesAsyncApi, obj, (C1421c) interfaceC2041d);
                                break;
                            case 2:
                                SharedPreferencesAsyncApi.Companion.setUp$lambda$14$lambda$13(sharedPreferencesAsyncApi, obj, (C1421c) interfaceC2041d);
                                break;
                            case 3:
                                SharedPreferencesAsyncApi.Companion.setUp$lambda$16$lambda$15(sharedPreferencesAsyncApi, obj, (C1421c) interfaceC2041d);
                                break;
                            case 4:
                                SharedPreferencesAsyncApi.Companion.setUp$lambda$18$lambda$17(sharedPreferencesAsyncApi, obj, (C1421c) interfaceC2041d);
                                break;
                            case 5:
                                SharedPreferencesAsyncApi.Companion.setUp$lambda$20$lambda$19(sharedPreferencesAsyncApi, obj, (C1421c) interfaceC2041d);
                                break;
                            case 6:
                                SharedPreferencesAsyncApi.Companion.setUp$lambda$22$lambda$21(sharedPreferencesAsyncApi, obj, (C1421c) interfaceC2041d);
                                break;
                            case 7:
                                SharedPreferencesAsyncApi.Companion.setUp$lambda$24$lambda$23(sharedPreferencesAsyncApi, obj, (C1421c) interfaceC2041d);
                                break;
                            case 8:
                                SharedPreferencesAsyncApi.Companion.setUp$lambda$26$lambda$25(sharedPreferencesAsyncApi, obj, (C1421c) interfaceC2041d);
                                break;
                            case 9:
                                SharedPreferencesAsyncApi.Companion.setUp$lambda$28$lambda$27(sharedPreferencesAsyncApi, obj, (C1421c) interfaceC2041d);
                                break;
                            case 10:
                                SharedPreferencesAsyncApi.Companion.setUp$lambda$30$lambda$29(sharedPreferencesAsyncApi, obj, (C1421c) interfaceC2041d);
                                break;
                            case 11:
                                SharedPreferencesAsyncApi.Companion.setUp$lambda$4$lambda$3(sharedPreferencesAsyncApi, obj, (C1421c) interfaceC2041d);
                                break;
                            case 12:
                                SharedPreferencesAsyncApi.Companion.setUp$lambda$6$lambda$5(sharedPreferencesAsyncApi, obj, (C1421c) interfaceC2041d);
                                break;
                            case 13:
                                SharedPreferencesAsyncApi.Companion.setUp$lambda$8$lambda$7(sharedPreferencesAsyncApi, obj, (C1421c) interfaceC2041d);
                                break;
                            default:
                                SharedPreferencesAsyncApi.Companion.setUp$lambda$10$lambda$9(sharedPreferencesAsyncApi, obj, (C1421c) interfaceC2041d);
                                break;
                        }
                    }
                });
            } else {
                c2042e2.b(null);
            }
            C2042e c2042e3 = new C2042e(binaryMessenger, AbstractC1414e.h("dev.flutter.pigeon.shared_preferences_android.SharedPreferencesAsyncApi.setInt", strConcat), getCodec(), hVarMakeBackgroundTaskQueue);
            if (sharedPreferencesAsyncApi != null) {
                final int i6 = 12;
                c2042e3.b(new InterfaceC2040c() { // from class: io.flutter.plugins.sharedpreferences.c
                    @Override // pg.InterfaceC2040c
                    public final void onMessage(Object obj, InterfaceC2041d interfaceC2041d) {
                        switch (i6) {
                            case 0:
                                SharedPreferencesAsyncApi.Companion.setUp$lambda$2$lambda$1(sharedPreferencesAsyncApi, obj, (C1421c) interfaceC2041d);
                                break;
                            case 1:
                                SharedPreferencesAsyncApi.Companion.setUp$lambda$12$lambda$11(sharedPreferencesAsyncApi, obj, (C1421c) interfaceC2041d);
                                break;
                            case 2:
                                SharedPreferencesAsyncApi.Companion.setUp$lambda$14$lambda$13(sharedPreferencesAsyncApi, obj, (C1421c) interfaceC2041d);
                                break;
                            case 3:
                                SharedPreferencesAsyncApi.Companion.setUp$lambda$16$lambda$15(sharedPreferencesAsyncApi, obj, (C1421c) interfaceC2041d);
                                break;
                            case 4:
                                SharedPreferencesAsyncApi.Companion.setUp$lambda$18$lambda$17(sharedPreferencesAsyncApi, obj, (C1421c) interfaceC2041d);
                                break;
                            case 5:
                                SharedPreferencesAsyncApi.Companion.setUp$lambda$20$lambda$19(sharedPreferencesAsyncApi, obj, (C1421c) interfaceC2041d);
                                break;
                            case 6:
                                SharedPreferencesAsyncApi.Companion.setUp$lambda$22$lambda$21(sharedPreferencesAsyncApi, obj, (C1421c) interfaceC2041d);
                                break;
                            case 7:
                                SharedPreferencesAsyncApi.Companion.setUp$lambda$24$lambda$23(sharedPreferencesAsyncApi, obj, (C1421c) interfaceC2041d);
                                break;
                            case 8:
                                SharedPreferencesAsyncApi.Companion.setUp$lambda$26$lambda$25(sharedPreferencesAsyncApi, obj, (C1421c) interfaceC2041d);
                                break;
                            case 9:
                                SharedPreferencesAsyncApi.Companion.setUp$lambda$28$lambda$27(sharedPreferencesAsyncApi, obj, (C1421c) interfaceC2041d);
                                break;
                            case 10:
                                SharedPreferencesAsyncApi.Companion.setUp$lambda$30$lambda$29(sharedPreferencesAsyncApi, obj, (C1421c) interfaceC2041d);
                                break;
                            case 11:
                                SharedPreferencesAsyncApi.Companion.setUp$lambda$4$lambda$3(sharedPreferencesAsyncApi, obj, (C1421c) interfaceC2041d);
                                break;
                            case 12:
                                SharedPreferencesAsyncApi.Companion.setUp$lambda$6$lambda$5(sharedPreferencesAsyncApi, obj, (C1421c) interfaceC2041d);
                                break;
                            case 13:
                                SharedPreferencesAsyncApi.Companion.setUp$lambda$8$lambda$7(sharedPreferencesAsyncApi, obj, (C1421c) interfaceC2041d);
                                break;
                            default:
                                SharedPreferencesAsyncApi.Companion.setUp$lambda$10$lambda$9(sharedPreferencesAsyncApi, obj, (C1421c) interfaceC2041d);
                                break;
                        }
                    }
                });
            } else {
                c2042e3.b(null);
            }
            C2042e c2042e4 = new C2042e(binaryMessenger, AbstractC1414e.h("dev.flutter.pigeon.shared_preferences_android.SharedPreferencesAsyncApi.setDouble", strConcat), getCodec(), hVarMakeBackgroundTaskQueue);
            if (sharedPreferencesAsyncApi != null) {
                final int i10 = 13;
                c2042e4.b(new InterfaceC2040c() { // from class: io.flutter.plugins.sharedpreferences.c
                    @Override // pg.InterfaceC2040c
                    public final void onMessage(Object obj, InterfaceC2041d interfaceC2041d) {
                        switch (i10) {
                            case 0:
                                SharedPreferencesAsyncApi.Companion.setUp$lambda$2$lambda$1(sharedPreferencesAsyncApi, obj, (C1421c) interfaceC2041d);
                                break;
                            case 1:
                                SharedPreferencesAsyncApi.Companion.setUp$lambda$12$lambda$11(sharedPreferencesAsyncApi, obj, (C1421c) interfaceC2041d);
                                break;
                            case 2:
                                SharedPreferencesAsyncApi.Companion.setUp$lambda$14$lambda$13(sharedPreferencesAsyncApi, obj, (C1421c) interfaceC2041d);
                                break;
                            case 3:
                                SharedPreferencesAsyncApi.Companion.setUp$lambda$16$lambda$15(sharedPreferencesAsyncApi, obj, (C1421c) interfaceC2041d);
                                break;
                            case 4:
                                SharedPreferencesAsyncApi.Companion.setUp$lambda$18$lambda$17(sharedPreferencesAsyncApi, obj, (C1421c) interfaceC2041d);
                                break;
                            case 5:
                                SharedPreferencesAsyncApi.Companion.setUp$lambda$20$lambda$19(sharedPreferencesAsyncApi, obj, (C1421c) interfaceC2041d);
                                break;
                            case 6:
                                SharedPreferencesAsyncApi.Companion.setUp$lambda$22$lambda$21(sharedPreferencesAsyncApi, obj, (C1421c) interfaceC2041d);
                                break;
                            case 7:
                                SharedPreferencesAsyncApi.Companion.setUp$lambda$24$lambda$23(sharedPreferencesAsyncApi, obj, (C1421c) interfaceC2041d);
                                break;
                            case 8:
                                SharedPreferencesAsyncApi.Companion.setUp$lambda$26$lambda$25(sharedPreferencesAsyncApi, obj, (C1421c) interfaceC2041d);
                                break;
                            case 9:
                                SharedPreferencesAsyncApi.Companion.setUp$lambda$28$lambda$27(sharedPreferencesAsyncApi, obj, (C1421c) interfaceC2041d);
                                break;
                            case 10:
                                SharedPreferencesAsyncApi.Companion.setUp$lambda$30$lambda$29(sharedPreferencesAsyncApi, obj, (C1421c) interfaceC2041d);
                                break;
                            case 11:
                                SharedPreferencesAsyncApi.Companion.setUp$lambda$4$lambda$3(sharedPreferencesAsyncApi, obj, (C1421c) interfaceC2041d);
                                break;
                            case 12:
                                SharedPreferencesAsyncApi.Companion.setUp$lambda$6$lambda$5(sharedPreferencesAsyncApi, obj, (C1421c) interfaceC2041d);
                                break;
                            case 13:
                                SharedPreferencesAsyncApi.Companion.setUp$lambda$8$lambda$7(sharedPreferencesAsyncApi, obj, (C1421c) interfaceC2041d);
                                break;
                            default:
                                SharedPreferencesAsyncApi.Companion.setUp$lambda$10$lambda$9(sharedPreferencesAsyncApi, obj, (C1421c) interfaceC2041d);
                                break;
                        }
                    }
                });
            } else {
                c2042e4.b(null);
            }
            C2042e c2042e5 = new C2042e(binaryMessenger, AbstractC1414e.h("dev.flutter.pigeon.shared_preferences_android.SharedPreferencesAsyncApi.setEncodedStringList", strConcat), getCodec(), hVarMakeBackgroundTaskQueue);
            if (sharedPreferencesAsyncApi != null) {
                final int i11 = 14;
                c2042e5.b(new InterfaceC2040c() { // from class: io.flutter.plugins.sharedpreferences.c
                    @Override // pg.InterfaceC2040c
                    public final void onMessage(Object obj, InterfaceC2041d interfaceC2041d) {
                        switch (i11) {
                            case 0:
                                SharedPreferencesAsyncApi.Companion.setUp$lambda$2$lambda$1(sharedPreferencesAsyncApi, obj, (C1421c) interfaceC2041d);
                                break;
                            case 1:
                                SharedPreferencesAsyncApi.Companion.setUp$lambda$12$lambda$11(sharedPreferencesAsyncApi, obj, (C1421c) interfaceC2041d);
                                break;
                            case 2:
                                SharedPreferencesAsyncApi.Companion.setUp$lambda$14$lambda$13(sharedPreferencesAsyncApi, obj, (C1421c) interfaceC2041d);
                                break;
                            case 3:
                                SharedPreferencesAsyncApi.Companion.setUp$lambda$16$lambda$15(sharedPreferencesAsyncApi, obj, (C1421c) interfaceC2041d);
                                break;
                            case 4:
                                SharedPreferencesAsyncApi.Companion.setUp$lambda$18$lambda$17(sharedPreferencesAsyncApi, obj, (C1421c) interfaceC2041d);
                                break;
                            case 5:
                                SharedPreferencesAsyncApi.Companion.setUp$lambda$20$lambda$19(sharedPreferencesAsyncApi, obj, (C1421c) interfaceC2041d);
                                break;
                            case 6:
                                SharedPreferencesAsyncApi.Companion.setUp$lambda$22$lambda$21(sharedPreferencesAsyncApi, obj, (C1421c) interfaceC2041d);
                                break;
                            case 7:
                                SharedPreferencesAsyncApi.Companion.setUp$lambda$24$lambda$23(sharedPreferencesAsyncApi, obj, (C1421c) interfaceC2041d);
                                break;
                            case 8:
                                SharedPreferencesAsyncApi.Companion.setUp$lambda$26$lambda$25(sharedPreferencesAsyncApi, obj, (C1421c) interfaceC2041d);
                                break;
                            case 9:
                                SharedPreferencesAsyncApi.Companion.setUp$lambda$28$lambda$27(sharedPreferencesAsyncApi, obj, (C1421c) interfaceC2041d);
                                break;
                            case 10:
                                SharedPreferencesAsyncApi.Companion.setUp$lambda$30$lambda$29(sharedPreferencesAsyncApi, obj, (C1421c) interfaceC2041d);
                                break;
                            case 11:
                                SharedPreferencesAsyncApi.Companion.setUp$lambda$4$lambda$3(sharedPreferencesAsyncApi, obj, (C1421c) interfaceC2041d);
                                break;
                            case 12:
                                SharedPreferencesAsyncApi.Companion.setUp$lambda$6$lambda$5(sharedPreferencesAsyncApi, obj, (C1421c) interfaceC2041d);
                                break;
                            case 13:
                                SharedPreferencesAsyncApi.Companion.setUp$lambda$8$lambda$7(sharedPreferencesAsyncApi, obj, (C1421c) interfaceC2041d);
                                break;
                            default:
                                SharedPreferencesAsyncApi.Companion.setUp$lambda$10$lambda$9(sharedPreferencesAsyncApi, obj, (C1421c) interfaceC2041d);
                                break;
                        }
                    }
                });
            } else {
                c2042e5.b(null);
            }
            C2042e c2042e6 = new C2042e(binaryMessenger, AbstractC1414e.h("dev.flutter.pigeon.shared_preferences_android.SharedPreferencesAsyncApi.setDeprecatedStringList", strConcat), getCodec(), hVarMakeBackgroundTaskQueue);
            if (sharedPreferencesAsyncApi != null) {
                final int i12 = 1;
                c2042e6.b(new InterfaceC2040c() { // from class: io.flutter.plugins.sharedpreferences.c
                    @Override // pg.InterfaceC2040c
                    public final void onMessage(Object obj, InterfaceC2041d interfaceC2041d) {
                        switch (i12) {
                            case 0:
                                SharedPreferencesAsyncApi.Companion.setUp$lambda$2$lambda$1(sharedPreferencesAsyncApi, obj, (C1421c) interfaceC2041d);
                                break;
                            case 1:
                                SharedPreferencesAsyncApi.Companion.setUp$lambda$12$lambda$11(sharedPreferencesAsyncApi, obj, (C1421c) interfaceC2041d);
                                break;
                            case 2:
                                SharedPreferencesAsyncApi.Companion.setUp$lambda$14$lambda$13(sharedPreferencesAsyncApi, obj, (C1421c) interfaceC2041d);
                                break;
                            case 3:
                                SharedPreferencesAsyncApi.Companion.setUp$lambda$16$lambda$15(sharedPreferencesAsyncApi, obj, (C1421c) interfaceC2041d);
                                break;
                            case 4:
                                SharedPreferencesAsyncApi.Companion.setUp$lambda$18$lambda$17(sharedPreferencesAsyncApi, obj, (C1421c) interfaceC2041d);
                                break;
                            case 5:
                                SharedPreferencesAsyncApi.Companion.setUp$lambda$20$lambda$19(sharedPreferencesAsyncApi, obj, (C1421c) interfaceC2041d);
                                break;
                            case 6:
                                SharedPreferencesAsyncApi.Companion.setUp$lambda$22$lambda$21(sharedPreferencesAsyncApi, obj, (C1421c) interfaceC2041d);
                                break;
                            case 7:
                                SharedPreferencesAsyncApi.Companion.setUp$lambda$24$lambda$23(sharedPreferencesAsyncApi, obj, (C1421c) interfaceC2041d);
                                break;
                            case 8:
                                SharedPreferencesAsyncApi.Companion.setUp$lambda$26$lambda$25(sharedPreferencesAsyncApi, obj, (C1421c) interfaceC2041d);
                                break;
                            case 9:
                                SharedPreferencesAsyncApi.Companion.setUp$lambda$28$lambda$27(sharedPreferencesAsyncApi, obj, (C1421c) interfaceC2041d);
                                break;
                            case 10:
                                SharedPreferencesAsyncApi.Companion.setUp$lambda$30$lambda$29(sharedPreferencesAsyncApi, obj, (C1421c) interfaceC2041d);
                                break;
                            case 11:
                                SharedPreferencesAsyncApi.Companion.setUp$lambda$4$lambda$3(sharedPreferencesAsyncApi, obj, (C1421c) interfaceC2041d);
                                break;
                            case 12:
                                SharedPreferencesAsyncApi.Companion.setUp$lambda$6$lambda$5(sharedPreferencesAsyncApi, obj, (C1421c) interfaceC2041d);
                                break;
                            case 13:
                                SharedPreferencesAsyncApi.Companion.setUp$lambda$8$lambda$7(sharedPreferencesAsyncApi, obj, (C1421c) interfaceC2041d);
                                break;
                            default:
                                SharedPreferencesAsyncApi.Companion.setUp$lambda$10$lambda$9(sharedPreferencesAsyncApi, obj, (C1421c) interfaceC2041d);
                                break;
                        }
                    }
                });
            } else {
                c2042e6.b(null);
            }
            C2042e c2042e7 = new C2042e(binaryMessenger, AbstractC1414e.h("dev.flutter.pigeon.shared_preferences_android.SharedPreferencesAsyncApi.getString", strConcat), getCodec(), hVarMakeBackgroundTaskQueue);
            if (sharedPreferencesAsyncApi != null) {
                final int i13 = 2;
                c2042e7.b(new InterfaceC2040c() { // from class: io.flutter.plugins.sharedpreferences.c
                    @Override // pg.InterfaceC2040c
                    public final void onMessage(Object obj, InterfaceC2041d interfaceC2041d) {
                        switch (i13) {
                            case 0:
                                SharedPreferencesAsyncApi.Companion.setUp$lambda$2$lambda$1(sharedPreferencesAsyncApi, obj, (C1421c) interfaceC2041d);
                                break;
                            case 1:
                                SharedPreferencesAsyncApi.Companion.setUp$lambda$12$lambda$11(sharedPreferencesAsyncApi, obj, (C1421c) interfaceC2041d);
                                break;
                            case 2:
                                SharedPreferencesAsyncApi.Companion.setUp$lambda$14$lambda$13(sharedPreferencesAsyncApi, obj, (C1421c) interfaceC2041d);
                                break;
                            case 3:
                                SharedPreferencesAsyncApi.Companion.setUp$lambda$16$lambda$15(sharedPreferencesAsyncApi, obj, (C1421c) interfaceC2041d);
                                break;
                            case 4:
                                SharedPreferencesAsyncApi.Companion.setUp$lambda$18$lambda$17(sharedPreferencesAsyncApi, obj, (C1421c) interfaceC2041d);
                                break;
                            case 5:
                                SharedPreferencesAsyncApi.Companion.setUp$lambda$20$lambda$19(sharedPreferencesAsyncApi, obj, (C1421c) interfaceC2041d);
                                break;
                            case 6:
                                SharedPreferencesAsyncApi.Companion.setUp$lambda$22$lambda$21(sharedPreferencesAsyncApi, obj, (C1421c) interfaceC2041d);
                                break;
                            case 7:
                                SharedPreferencesAsyncApi.Companion.setUp$lambda$24$lambda$23(sharedPreferencesAsyncApi, obj, (C1421c) interfaceC2041d);
                                break;
                            case 8:
                                SharedPreferencesAsyncApi.Companion.setUp$lambda$26$lambda$25(sharedPreferencesAsyncApi, obj, (C1421c) interfaceC2041d);
                                break;
                            case 9:
                                SharedPreferencesAsyncApi.Companion.setUp$lambda$28$lambda$27(sharedPreferencesAsyncApi, obj, (C1421c) interfaceC2041d);
                                break;
                            case 10:
                                SharedPreferencesAsyncApi.Companion.setUp$lambda$30$lambda$29(sharedPreferencesAsyncApi, obj, (C1421c) interfaceC2041d);
                                break;
                            case 11:
                                SharedPreferencesAsyncApi.Companion.setUp$lambda$4$lambda$3(sharedPreferencesAsyncApi, obj, (C1421c) interfaceC2041d);
                                break;
                            case 12:
                                SharedPreferencesAsyncApi.Companion.setUp$lambda$6$lambda$5(sharedPreferencesAsyncApi, obj, (C1421c) interfaceC2041d);
                                break;
                            case 13:
                                SharedPreferencesAsyncApi.Companion.setUp$lambda$8$lambda$7(sharedPreferencesAsyncApi, obj, (C1421c) interfaceC2041d);
                                break;
                            default:
                                SharedPreferencesAsyncApi.Companion.setUp$lambda$10$lambda$9(sharedPreferencesAsyncApi, obj, (C1421c) interfaceC2041d);
                                break;
                        }
                    }
                });
            } else {
                c2042e7.b(null);
            }
            C2042e c2042e8 = new C2042e(binaryMessenger, AbstractC1414e.h("dev.flutter.pigeon.shared_preferences_android.SharedPreferencesAsyncApi.getBool", strConcat), getCodec(), hVarMakeBackgroundTaskQueue);
            if (sharedPreferencesAsyncApi != null) {
                final int i14 = 3;
                c2042e8.b(new InterfaceC2040c() { // from class: io.flutter.plugins.sharedpreferences.c
                    @Override // pg.InterfaceC2040c
                    public final void onMessage(Object obj, InterfaceC2041d interfaceC2041d) {
                        switch (i14) {
                            case 0:
                                SharedPreferencesAsyncApi.Companion.setUp$lambda$2$lambda$1(sharedPreferencesAsyncApi, obj, (C1421c) interfaceC2041d);
                                break;
                            case 1:
                                SharedPreferencesAsyncApi.Companion.setUp$lambda$12$lambda$11(sharedPreferencesAsyncApi, obj, (C1421c) interfaceC2041d);
                                break;
                            case 2:
                                SharedPreferencesAsyncApi.Companion.setUp$lambda$14$lambda$13(sharedPreferencesAsyncApi, obj, (C1421c) interfaceC2041d);
                                break;
                            case 3:
                                SharedPreferencesAsyncApi.Companion.setUp$lambda$16$lambda$15(sharedPreferencesAsyncApi, obj, (C1421c) interfaceC2041d);
                                break;
                            case 4:
                                SharedPreferencesAsyncApi.Companion.setUp$lambda$18$lambda$17(sharedPreferencesAsyncApi, obj, (C1421c) interfaceC2041d);
                                break;
                            case 5:
                                SharedPreferencesAsyncApi.Companion.setUp$lambda$20$lambda$19(sharedPreferencesAsyncApi, obj, (C1421c) interfaceC2041d);
                                break;
                            case 6:
                                SharedPreferencesAsyncApi.Companion.setUp$lambda$22$lambda$21(sharedPreferencesAsyncApi, obj, (C1421c) interfaceC2041d);
                                break;
                            case 7:
                                SharedPreferencesAsyncApi.Companion.setUp$lambda$24$lambda$23(sharedPreferencesAsyncApi, obj, (C1421c) interfaceC2041d);
                                break;
                            case 8:
                                SharedPreferencesAsyncApi.Companion.setUp$lambda$26$lambda$25(sharedPreferencesAsyncApi, obj, (C1421c) interfaceC2041d);
                                break;
                            case 9:
                                SharedPreferencesAsyncApi.Companion.setUp$lambda$28$lambda$27(sharedPreferencesAsyncApi, obj, (C1421c) interfaceC2041d);
                                break;
                            case 10:
                                SharedPreferencesAsyncApi.Companion.setUp$lambda$30$lambda$29(sharedPreferencesAsyncApi, obj, (C1421c) interfaceC2041d);
                                break;
                            case 11:
                                SharedPreferencesAsyncApi.Companion.setUp$lambda$4$lambda$3(sharedPreferencesAsyncApi, obj, (C1421c) interfaceC2041d);
                                break;
                            case 12:
                                SharedPreferencesAsyncApi.Companion.setUp$lambda$6$lambda$5(sharedPreferencesAsyncApi, obj, (C1421c) interfaceC2041d);
                                break;
                            case 13:
                                SharedPreferencesAsyncApi.Companion.setUp$lambda$8$lambda$7(sharedPreferencesAsyncApi, obj, (C1421c) interfaceC2041d);
                                break;
                            default:
                                SharedPreferencesAsyncApi.Companion.setUp$lambda$10$lambda$9(sharedPreferencesAsyncApi, obj, (C1421c) interfaceC2041d);
                                break;
                        }
                    }
                });
            } else {
                c2042e8.b(null);
            }
            C2042e c2042e9 = new C2042e(binaryMessenger, AbstractC1414e.h("dev.flutter.pigeon.shared_preferences_android.SharedPreferencesAsyncApi.getDouble", strConcat), getCodec(), hVarMakeBackgroundTaskQueue);
            if (sharedPreferencesAsyncApi != null) {
                final int i15 = 4;
                c2042e9.b(new InterfaceC2040c() { // from class: io.flutter.plugins.sharedpreferences.c
                    @Override // pg.InterfaceC2040c
                    public final void onMessage(Object obj, InterfaceC2041d interfaceC2041d) {
                        switch (i15) {
                            case 0:
                                SharedPreferencesAsyncApi.Companion.setUp$lambda$2$lambda$1(sharedPreferencesAsyncApi, obj, (C1421c) interfaceC2041d);
                                break;
                            case 1:
                                SharedPreferencesAsyncApi.Companion.setUp$lambda$12$lambda$11(sharedPreferencesAsyncApi, obj, (C1421c) interfaceC2041d);
                                break;
                            case 2:
                                SharedPreferencesAsyncApi.Companion.setUp$lambda$14$lambda$13(sharedPreferencesAsyncApi, obj, (C1421c) interfaceC2041d);
                                break;
                            case 3:
                                SharedPreferencesAsyncApi.Companion.setUp$lambda$16$lambda$15(sharedPreferencesAsyncApi, obj, (C1421c) interfaceC2041d);
                                break;
                            case 4:
                                SharedPreferencesAsyncApi.Companion.setUp$lambda$18$lambda$17(sharedPreferencesAsyncApi, obj, (C1421c) interfaceC2041d);
                                break;
                            case 5:
                                SharedPreferencesAsyncApi.Companion.setUp$lambda$20$lambda$19(sharedPreferencesAsyncApi, obj, (C1421c) interfaceC2041d);
                                break;
                            case 6:
                                SharedPreferencesAsyncApi.Companion.setUp$lambda$22$lambda$21(sharedPreferencesAsyncApi, obj, (C1421c) interfaceC2041d);
                                break;
                            case 7:
                                SharedPreferencesAsyncApi.Companion.setUp$lambda$24$lambda$23(sharedPreferencesAsyncApi, obj, (C1421c) interfaceC2041d);
                                break;
                            case 8:
                                SharedPreferencesAsyncApi.Companion.setUp$lambda$26$lambda$25(sharedPreferencesAsyncApi, obj, (C1421c) interfaceC2041d);
                                break;
                            case 9:
                                SharedPreferencesAsyncApi.Companion.setUp$lambda$28$lambda$27(sharedPreferencesAsyncApi, obj, (C1421c) interfaceC2041d);
                                break;
                            case 10:
                                SharedPreferencesAsyncApi.Companion.setUp$lambda$30$lambda$29(sharedPreferencesAsyncApi, obj, (C1421c) interfaceC2041d);
                                break;
                            case 11:
                                SharedPreferencesAsyncApi.Companion.setUp$lambda$4$lambda$3(sharedPreferencesAsyncApi, obj, (C1421c) interfaceC2041d);
                                break;
                            case 12:
                                SharedPreferencesAsyncApi.Companion.setUp$lambda$6$lambda$5(sharedPreferencesAsyncApi, obj, (C1421c) interfaceC2041d);
                                break;
                            case 13:
                                SharedPreferencesAsyncApi.Companion.setUp$lambda$8$lambda$7(sharedPreferencesAsyncApi, obj, (C1421c) interfaceC2041d);
                                break;
                            default:
                                SharedPreferencesAsyncApi.Companion.setUp$lambda$10$lambda$9(sharedPreferencesAsyncApi, obj, (C1421c) interfaceC2041d);
                                break;
                        }
                    }
                });
            } else {
                c2042e9.b(null);
            }
            C2042e c2042e10 = new C2042e(binaryMessenger, AbstractC1414e.h("dev.flutter.pigeon.shared_preferences_android.SharedPreferencesAsyncApi.getInt", strConcat), getCodec(), hVarMakeBackgroundTaskQueue);
            if (sharedPreferencesAsyncApi != null) {
                final int i16 = 5;
                c2042e10.b(new InterfaceC2040c() { // from class: io.flutter.plugins.sharedpreferences.c
                    @Override // pg.InterfaceC2040c
                    public final void onMessage(Object obj, InterfaceC2041d interfaceC2041d) {
                        switch (i16) {
                            case 0:
                                SharedPreferencesAsyncApi.Companion.setUp$lambda$2$lambda$1(sharedPreferencesAsyncApi, obj, (C1421c) interfaceC2041d);
                                break;
                            case 1:
                                SharedPreferencesAsyncApi.Companion.setUp$lambda$12$lambda$11(sharedPreferencesAsyncApi, obj, (C1421c) interfaceC2041d);
                                break;
                            case 2:
                                SharedPreferencesAsyncApi.Companion.setUp$lambda$14$lambda$13(sharedPreferencesAsyncApi, obj, (C1421c) interfaceC2041d);
                                break;
                            case 3:
                                SharedPreferencesAsyncApi.Companion.setUp$lambda$16$lambda$15(sharedPreferencesAsyncApi, obj, (C1421c) interfaceC2041d);
                                break;
                            case 4:
                                SharedPreferencesAsyncApi.Companion.setUp$lambda$18$lambda$17(sharedPreferencesAsyncApi, obj, (C1421c) interfaceC2041d);
                                break;
                            case 5:
                                SharedPreferencesAsyncApi.Companion.setUp$lambda$20$lambda$19(sharedPreferencesAsyncApi, obj, (C1421c) interfaceC2041d);
                                break;
                            case 6:
                                SharedPreferencesAsyncApi.Companion.setUp$lambda$22$lambda$21(sharedPreferencesAsyncApi, obj, (C1421c) interfaceC2041d);
                                break;
                            case 7:
                                SharedPreferencesAsyncApi.Companion.setUp$lambda$24$lambda$23(sharedPreferencesAsyncApi, obj, (C1421c) interfaceC2041d);
                                break;
                            case 8:
                                SharedPreferencesAsyncApi.Companion.setUp$lambda$26$lambda$25(sharedPreferencesAsyncApi, obj, (C1421c) interfaceC2041d);
                                break;
                            case 9:
                                SharedPreferencesAsyncApi.Companion.setUp$lambda$28$lambda$27(sharedPreferencesAsyncApi, obj, (C1421c) interfaceC2041d);
                                break;
                            case 10:
                                SharedPreferencesAsyncApi.Companion.setUp$lambda$30$lambda$29(sharedPreferencesAsyncApi, obj, (C1421c) interfaceC2041d);
                                break;
                            case 11:
                                SharedPreferencesAsyncApi.Companion.setUp$lambda$4$lambda$3(sharedPreferencesAsyncApi, obj, (C1421c) interfaceC2041d);
                                break;
                            case 12:
                                SharedPreferencesAsyncApi.Companion.setUp$lambda$6$lambda$5(sharedPreferencesAsyncApi, obj, (C1421c) interfaceC2041d);
                                break;
                            case 13:
                                SharedPreferencesAsyncApi.Companion.setUp$lambda$8$lambda$7(sharedPreferencesAsyncApi, obj, (C1421c) interfaceC2041d);
                                break;
                            default:
                                SharedPreferencesAsyncApi.Companion.setUp$lambda$10$lambda$9(sharedPreferencesAsyncApi, obj, (C1421c) interfaceC2041d);
                                break;
                        }
                    }
                });
            } else {
                c2042e10.b(null);
            }
            C2042e c2042e11 = new C2042e(binaryMessenger, AbstractC1414e.h("dev.flutter.pigeon.shared_preferences_android.SharedPreferencesAsyncApi.getPlatformEncodedStringList", strConcat), getCodec(), hVarMakeBackgroundTaskQueue);
            if (sharedPreferencesAsyncApi != null) {
                final int i17 = 6;
                c2042e11.b(new InterfaceC2040c() { // from class: io.flutter.plugins.sharedpreferences.c
                    @Override // pg.InterfaceC2040c
                    public final void onMessage(Object obj, InterfaceC2041d interfaceC2041d) {
                        switch (i17) {
                            case 0:
                                SharedPreferencesAsyncApi.Companion.setUp$lambda$2$lambda$1(sharedPreferencesAsyncApi, obj, (C1421c) interfaceC2041d);
                                break;
                            case 1:
                                SharedPreferencesAsyncApi.Companion.setUp$lambda$12$lambda$11(sharedPreferencesAsyncApi, obj, (C1421c) interfaceC2041d);
                                break;
                            case 2:
                                SharedPreferencesAsyncApi.Companion.setUp$lambda$14$lambda$13(sharedPreferencesAsyncApi, obj, (C1421c) interfaceC2041d);
                                break;
                            case 3:
                                SharedPreferencesAsyncApi.Companion.setUp$lambda$16$lambda$15(sharedPreferencesAsyncApi, obj, (C1421c) interfaceC2041d);
                                break;
                            case 4:
                                SharedPreferencesAsyncApi.Companion.setUp$lambda$18$lambda$17(sharedPreferencesAsyncApi, obj, (C1421c) interfaceC2041d);
                                break;
                            case 5:
                                SharedPreferencesAsyncApi.Companion.setUp$lambda$20$lambda$19(sharedPreferencesAsyncApi, obj, (C1421c) interfaceC2041d);
                                break;
                            case 6:
                                SharedPreferencesAsyncApi.Companion.setUp$lambda$22$lambda$21(sharedPreferencesAsyncApi, obj, (C1421c) interfaceC2041d);
                                break;
                            case 7:
                                SharedPreferencesAsyncApi.Companion.setUp$lambda$24$lambda$23(sharedPreferencesAsyncApi, obj, (C1421c) interfaceC2041d);
                                break;
                            case 8:
                                SharedPreferencesAsyncApi.Companion.setUp$lambda$26$lambda$25(sharedPreferencesAsyncApi, obj, (C1421c) interfaceC2041d);
                                break;
                            case 9:
                                SharedPreferencesAsyncApi.Companion.setUp$lambda$28$lambda$27(sharedPreferencesAsyncApi, obj, (C1421c) interfaceC2041d);
                                break;
                            case 10:
                                SharedPreferencesAsyncApi.Companion.setUp$lambda$30$lambda$29(sharedPreferencesAsyncApi, obj, (C1421c) interfaceC2041d);
                                break;
                            case 11:
                                SharedPreferencesAsyncApi.Companion.setUp$lambda$4$lambda$3(sharedPreferencesAsyncApi, obj, (C1421c) interfaceC2041d);
                                break;
                            case 12:
                                SharedPreferencesAsyncApi.Companion.setUp$lambda$6$lambda$5(sharedPreferencesAsyncApi, obj, (C1421c) interfaceC2041d);
                                break;
                            case 13:
                                SharedPreferencesAsyncApi.Companion.setUp$lambda$8$lambda$7(sharedPreferencesAsyncApi, obj, (C1421c) interfaceC2041d);
                                break;
                            default:
                                SharedPreferencesAsyncApi.Companion.setUp$lambda$10$lambda$9(sharedPreferencesAsyncApi, obj, (C1421c) interfaceC2041d);
                                break;
                        }
                    }
                });
            } else {
                c2042e11.b(null);
            }
            C2042e c2042e12 = new C2042e(binaryMessenger, AbstractC1414e.h("dev.flutter.pigeon.shared_preferences_android.SharedPreferencesAsyncApi.getStringList", strConcat), getCodec(), hVarMakeBackgroundTaskQueue);
            if (sharedPreferencesAsyncApi != null) {
                final int i18 = 7;
                c2042e12.b(new InterfaceC2040c() { // from class: io.flutter.plugins.sharedpreferences.c
                    @Override // pg.InterfaceC2040c
                    public final void onMessage(Object obj, InterfaceC2041d interfaceC2041d) {
                        switch (i18) {
                            case 0:
                                SharedPreferencesAsyncApi.Companion.setUp$lambda$2$lambda$1(sharedPreferencesAsyncApi, obj, (C1421c) interfaceC2041d);
                                break;
                            case 1:
                                SharedPreferencesAsyncApi.Companion.setUp$lambda$12$lambda$11(sharedPreferencesAsyncApi, obj, (C1421c) interfaceC2041d);
                                break;
                            case 2:
                                SharedPreferencesAsyncApi.Companion.setUp$lambda$14$lambda$13(sharedPreferencesAsyncApi, obj, (C1421c) interfaceC2041d);
                                break;
                            case 3:
                                SharedPreferencesAsyncApi.Companion.setUp$lambda$16$lambda$15(sharedPreferencesAsyncApi, obj, (C1421c) interfaceC2041d);
                                break;
                            case 4:
                                SharedPreferencesAsyncApi.Companion.setUp$lambda$18$lambda$17(sharedPreferencesAsyncApi, obj, (C1421c) interfaceC2041d);
                                break;
                            case 5:
                                SharedPreferencesAsyncApi.Companion.setUp$lambda$20$lambda$19(sharedPreferencesAsyncApi, obj, (C1421c) interfaceC2041d);
                                break;
                            case 6:
                                SharedPreferencesAsyncApi.Companion.setUp$lambda$22$lambda$21(sharedPreferencesAsyncApi, obj, (C1421c) interfaceC2041d);
                                break;
                            case 7:
                                SharedPreferencesAsyncApi.Companion.setUp$lambda$24$lambda$23(sharedPreferencesAsyncApi, obj, (C1421c) interfaceC2041d);
                                break;
                            case 8:
                                SharedPreferencesAsyncApi.Companion.setUp$lambda$26$lambda$25(sharedPreferencesAsyncApi, obj, (C1421c) interfaceC2041d);
                                break;
                            case 9:
                                SharedPreferencesAsyncApi.Companion.setUp$lambda$28$lambda$27(sharedPreferencesAsyncApi, obj, (C1421c) interfaceC2041d);
                                break;
                            case 10:
                                SharedPreferencesAsyncApi.Companion.setUp$lambda$30$lambda$29(sharedPreferencesAsyncApi, obj, (C1421c) interfaceC2041d);
                                break;
                            case 11:
                                SharedPreferencesAsyncApi.Companion.setUp$lambda$4$lambda$3(sharedPreferencesAsyncApi, obj, (C1421c) interfaceC2041d);
                                break;
                            case 12:
                                SharedPreferencesAsyncApi.Companion.setUp$lambda$6$lambda$5(sharedPreferencesAsyncApi, obj, (C1421c) interfaceC2041d);
                                break;
                            case 13:
                                SharedPreferencesAsyncApi.Companion.setUp$lambda$8$lambda$7(sharedPreferencesAsyncApi, obj, (C1421c) interfaceC2041d);
                                break;
                            default:
                                SharedPreferencesAsyncApi.Companion.setUp$lambda$10$lambda$9(sharedPreferencesAsyncApi, obj, (C1421c) interfaceC2041d);
                                break;
                        }
                    }
                });
            } else {
                c2042e12.b(null);
            }
            C2042e c2042e13 = new C2042e(binaryMessenger, AbstractC1414e.h("dev.flutter.pigeon.shared_preferences_android.SharedPreferencesAsyncApi.clear", strConcat), getCodec(), hVarMakeBackgroundTaskQueue);
            if (sharedPreferencesAsyncApi != null) {
                final int i19 = 8;
                c2042e13.b(new InterfaceC2040c() { // from class: io.flutter.plugins.sharedpreferences.c
                    @Override // pg.InterfaceC2040c
                    public final void onMessage(Object obj, InterfaceC2041d interfaceC2041d) {
                        switch (i19) {
                            case 0:
                                SharedPreferencesAsyncApi.Companion.setUp$lambda$2$lambda$1(sharedPreferencesAsyncApi, obj, (C1421c) interfaceC2041d);
                                break;
                            case 1:
                                SharedPreferencesAsyncApi.Companion.setUp$lambda$12$lambda$11(sharedPreferencesAsyncApi, obj, (C1421c) interfaceC2041d);
                                break;
                            case 2:
                                SharedPreferencesAsyncApi.Companion.setUp$lambda$14$lambda$13(sharedPreferencesAsyncApi, obj, (C1421c) interfaceC2041d);
                                break;
                            case 3:
                                SharedPreferencesAsyncApi.Companion.setUp$lambda$16$lambda$15(sharedPreferencesAsyncApi, obj, (C1421c) interfaceC2041d);
                                break;
                            case 4:
                                SharedPreferencesAsyncApi.Companion.setUp$lambda$18$lambda$17(sharedPreferencesAsyncApi, obj, (C1421c) interfaceC2041d);
                                break;
                            case 5:
                                SharedPreferencesAsyncApi.Companion.setUp$lambda$20$lambda$19(sharedPreferencesAsyncApi, obj, (C1421c) interfaceC2041d);
                                break;
                            case 6:
                                SharedPreferencesAsyncApi.Companion.setUp$lambda$22$lambda$21(sharedPreferencesAsyncApi, obj, (C1421c) interfaceC2041d);
                                break;
                            case 7:
                                SharedPreferencesAsyncApi.Companion.setUp$lambda$24$lambda$23(sharedPreferencesAsyncApi, obj, (C1421c) interfaceC2041d);
                                break;
                            case 8:
                                SharedPreferencesAsyncApi.Companion.setUp$lambda$26$lambda$25(sharedPreferencesAsyncApi, obj, (C1421c) interfaceC2041d);
                                break;
                            case 9:
                                SharedPreferencesAsyncApi.Companion.setUp$lambda$28$lambda$27(sharedPreferencesAsyncApi, obj, (C1421c) interfaceC2041d);
                                break;
                            case 10:
                                SharedPreferencesAsyncApi.Companion.setUp$lambda$30$lambda$29(sharedPreferencesAsyncApi, obj, (C1421c) interfaceC2041d);
                                break;
                            case 11:
                                SharedPreferencesAsyncApi.Companion.setUp$lambda$4$lambda$3(sharedPreferencesAsyncApi, obj, (C1421c) interfaceC2041d);
                                break;
                            case 12:
                                SharedPreferencesAsyncApi.Companion.setUp$lambda$6$lambda$5(sharedPreferencesAsyncApi, obj, (C1421c) interfaceC2041d);
                                break;
                            case 13:
                                SharedPreferencesAsyncApi.Companion.setUp$lambda$8$lambda$7(sharedPreferencesAsyncApi, obj, (C1421c) interfaceC2041d);
                                break;
                            default:
                                SharedPreferencesAsyncApi.Companion.setUp$lambda$10$lambda$9(sharedPreferencesAsyncApi, obj, (C1421c) interfaceC2041d);
                                break;
                        }
                    }
                });
            } else {
                c2042e13.b(null);
            }
            C2042e c2042e14 = new C2042e(binaryMessenger, AbstractC1414e.h("dev.flutter.pigeon.shared_preferences_android.SharedPreferencesAsyncApi.getAll", strConcat), getCodec(), hVarMakeBackgroundTaskQueue);
            if (sharedPreferencesAsyncApi != null) {
                final int i20 = 9;
                c2042e14.b(new InterfaceC2040c() { // from class: io.flutter.plugins.sharedpreferences.c
                    @Override // pg.InterfaceC2040c
                    public final void onMessage(Object obj, InterfaceC2041d interfaceC2041d) {
                        switch (i20) {
                            case 0:
                                SharedPreferencesAsyncApi.Companion.setUp$lambda$2$lambda$1(sharedPreferencesAsyncApi, obj, (C1421c) interfaceC2041d);
                                break;
                            case 1:
                                SharedPreferencesAsyncApi.Companion.setUp$lambda$12$lambda$11(sharedPreferencesAsyncApi, obj, (C1421c) interfaceC2041d);
                                break;
                            case 2:
                                SharedPreferencesAsyncApi.Companion.setUp$lambda$14$lambda$13(sharedPreferencesAsyncApi, obj, (C1421c) interfaceC2041d);
                                break;
                            case 3:
                                SharedPreferencesAsyncApi.Companion.setUp$lambda$16$lambda$15(sharedPreferencesAsyncApi, obj, (C1421c) interfaceC2041d);
                                break;
                            case 4:
                                SharedPreferencesAsyncApi.Companion.setUp$lambda$18$lambda$17(sharedPreferencesAsyncApi, obj, (C1421c) interfaceC2041d);
                                break;
                            case 5:
                                SharedPreferencesAsyncApi.Companion.setUp$lambda$20$lambda$19(sharedPreferencesAsyncApi, obj, (C1421c) interfaceC2041d);
                                break;
                            case 6:
                                SharedPreferencesAsyncApi.Companion.setUp$lambda$22$lambda$21(sharedPreferencesAsyncApi, obj, (C1421c) interfaceC2041d);
                                break;
                            case 7:
                                SharedPreferencesAsyncApi.Companion.setUp$lambda$24$lambda$23(sharedPreferencesAsyncApi, obj, (C1421c) interfaceC2041d);
                                break;
                            case 8:
                                SharedPreferencesAsyncApi.Companion.setUp$lambda$26$lambda$25(sharedPreferencesAsyncApi, obj, (C1421c) interfaceC2041d);
                                break;
                            case 9:
                                SharedPreferencesAsyncApi.Companion.setUp$lambda$28$lambda$27(sharedPreferencesAsyncApi, obj, (C1421c) interfaceC2041d);
                                break;
                            case 10:
                                SharedPreferencesAsyncApi.Companion.setUp$lambda$30$lambda$29(sharedPreferencesAsyncApi, obj, (C1421c) interfaceC2041d);
                                break;
                            case 11:
                                SharedPreferencesAsyncApi.Companion.setUp$lambda$4$lambda$3(sharedPreferencesAsyncApi, obj, (C1421c) interfaceC2041d);
                                break;
                            case 12:
                                SharedPreferencesAsyncApi.Companion.setUp$lambda$6$lambda$5(sharedPreferencesAsyncApi, obj, (C1421c) interfaceC2041d);
                                break;
                            case 13:
                                SharedPreferencesAsyncApi.Companion.setUp$lambda$8$lambda$7(sharedPreferencesAsyncApi, obj, (C1421c) interfaceC2041d);
                                break;
                            default:
                                SharedPreferencesAsyncApi.Companion.setUp$lambda$10$lambda$9(sharedPreferencesAsyncApi, obj, (C1421c) interfaceC2041d);
                                break;
                        }
                    }
                });
            } else {
                c2042e14.b(null);
            }
            C2042e c2042e15 = new C2042e(binaryMessenger, AbstractC1414e.h("dev.flutter.pigeon.shared_preferences_android.SharedPreferencesAsyncApi.getKeys", strConcat), getCodec(), hVarMakeBackgroundTaskQueue);
            if (sharedPreferencesAsyncApi == null) {
                c2042e15.b(null);
            } else {
                final int i21 = 10;
                c2042e15.b(new InterfaceC2040c() { // from class: io.flutter.plugins.sharedpreferences.c
                    @Override // pg.InterfaceC2040c
                    public final void onMessage(Object obj, InterfaceC2041d interfaceC2041d) {
                        switch (i21) {
                            case 0:
                                SharedPreferencesAsyncApi.Companion.setUp$lambda$2$lambda$1(sharedPreferencesAsyncApi, obj, (C1421c) interfaceC2041d);
                                break;
                            case 1:
                                SharedPreferencesAsyncApi.Companion.setUp$lambda$12$lambda$11(sharedPreferencesAsyncApi, obj, (C1421c) interfaceC2041d);
                                break;
                            case 2:
                                SharedPreferencesAsyncApi.Companion.setUp$lambda$14$lambda$13(sharedPreferencesAsyncApi, obj, (C1421c) interfaceC2041d);
                                break;
                            case 3:
                                SharedPreferencesAsyncApi.Companion.setUp$lambda$16$lambda$15(sharedPreferencesAsyncApi, obj, (C1421c) interfaceC2041d);
                                break;
                            case 4:
                                SharedPreferencesAsyncApi.Companion.setUp$lambda$18$lambda$17(sharedPreferencesAsyncApi, obj, (C1421c) interfaceC2041d);
                                break;
                            case 5:
                                SharedPreferencesAsyncApi.Companion.setUp$lambda$20$lambda$19(sharedPreferencesAsyncApi, obj, (C1421c) interfaceC2041d);
                                break;
                            case 6:
                                SharedPreferencesAsyncApi.Companion.setUp$lambda$22$lambda$21(sharedPreferencesAsyncApi, obj, (C1421c) interfaceC2041d);
                                break;
                            case 7:
                                SharedPreferencesAsyncApi.Companion.setUp$lambda$24$lambda$23(sharedPreferencesAsyncApi, obj, (C1421c) interfaceC2041d);
                                break;
                            case 8:
                                SharedPreferencesAsyncApi.Companion.setUp$lambda$26$lambda$25(sharedPreferencesAsyncApi, obj, (C1421c) interfaceC2041d);
                                break;
                            case 9:
                                SharedPreferencesAsyncApi.Companion.setUp$lambda$28$lambda$27(sharedPreferencesAsyncApi, obj, (C1421c) interfaceC2041d);
                                break;
                            case 10:
                                SharedPreferencesAsyncApi.Companion.setUp$lambda$30$lambda$29(sharedPreferencesAsyncApi, obj, (C1421c) interfaceC2041d);
                                break;
                            case 11:
                                SharedPreferencesAsyncApi.Companion.setUp$lambda$4$lambda$3(sharedPreferencesAsyncApi, obj, (C1421c) interfaceC2041d);
                                break;
                            case 12:
                                SharedPreferencesAsyncApi.Companion.setUp$lambda$6$lambda$5(sharedPreferencesAsyncApi, obj, (C1421c) interfaceC2041d);
                                break;
                            case 13:
                                SharedPreferencesAsyncApi.Companion.setUp$lambda$8$lambda$7(sharedPreferencesAsyncApi, obj, (C1421c) interfaceC2041d);
                                break;
                            default:
                                SharedPreferencesAsyncApi.Companion.setUp$lambda$10$lambda$9(sharedPreferencesAsyncApi, obj, (C1421c) interfaceC2041d);
                                break;
                        }
                    }
                });
            }
        }
    }

    void clear(List<String> list, SharedPreferencesPigeonOptions sharedPreferencesPigeonOptions);

    Map<String, Object> getAll(List<String> list, SharedPreferencesPigeonOptions sharedPreferencesPigeonOptions);

    Boolean getBool(String str, SharedPreferencesPigeonOptions sharedPreferencesPigeonOptions);

    Double getDouble(String str, SharedPreferencesPigeonOptions sharedPreferencesPigeonOptions);

    Long getInt(String str, SharedPreferencesPigeonOptions sharedPreferencesPigeonOptions);

    List<String> getKeys(List<String> list, SharedPreferencesPigeonOptions sharedPreferencesPigeonOptions);

    List<String> getPlatformEncodedStringList(String str, SharedPreferencesPigeonOptions sharedPreferencesPigeonOptions);

    String getString(String str, SharedPreferencesPigeonOptions sharedPreferencesPigeonOptions);

    StringListResult getStringList(String str, SharedPreferencesPigeonOptions sharedPreferencesPigeonOptions);

    void setBool(String str, boolean z4, SharedPreferencesPigeonOptions sharedPreferencesPigeonOptions);

    void setDeprecatedStringList(String str, List<String> list, SharedPreferencesPigeonOptions sharedPreferencesPigeonOptions);

    void setDouble(String str, double d10, SharedPreferencesPigeonOptions sharedPreferencesPigeonOptions);

    void setEncodedStringList(String str, String str2, SharedPreferencesPigeonOptions sharedPreferencesPigeonOptions);

    void setInt(String str, long j, SharedPreferencesPigeonOptions sharedPreferencesPigeonOptions);

    void setString(String str, String str2, SharedPreferencesPigeonOptions sharedPreferencesPigeonOptions);
}
