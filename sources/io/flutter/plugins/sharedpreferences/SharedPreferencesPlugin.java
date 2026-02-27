package io.flutter.plugins.sharedpreferences;

import Bj.E;
import Bj.H;
import Ej.InterfaceC0230h;
import Ej.InterfaceC0231i;
import Ej.W;
import android.content.Context;
import android.util.Log;
import androidx.annotation.VisibleForTesting;
import androidx.datastore.core.DataStore;
import androidx.datastore.preferences.core.MutablePreferences;
import androidx.datastore.preferences.core.Preferences;
import androidx.datastore.preferences.core.PreferencesKeys;
import androidx.datastore.preferences.core.PreferencesKt;
import androidx.media3.extractor.ts.TsExtractor;
import bj.AbstractC1039j;
import cj.C1110A;
import com.dynatrace.android.agent.conf.ServerConfiguration;
import com.paymaya.domain.model.MfaTencentErrorResult;
import defpackage.AbstractC1414e;
import gj.InterfaceC1526a;
import hj.EnumC1578a;
import ij.AbstractC1609c;
import ij.AbstractC1616j;
import ij.InterfaceC1611e;
import io.flutter.embedding.engine.plugins.FlutterPlugin;
import io.flutter.plugins.sharedpreferences.SharedPreferencesAsyncApi;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Unit;
import kotlin.coroutines.g;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.j;
import kotlin.jvm.internal.y;
import mx_android.support.v7.media.MediaRouter;
import zj.z;

/* JADX INFO: loaded from: classes4.dex */
public final class SharedPreferencesPlugin implements FlutterPlugin, SharedPreferencesAsyncApi {
    private SharedPreferencesBackend backend;
    private Context context;
    private SharedPreferencesListEncoder listEncoder;

    /* JADX INFO: renamed from: io.flutter.plugins.sharedpreferences.SharedPreferencesPlugin$clear$1, reason: invalid class name */
    @InterfaceC1611e(c = "io.flutter.plugins.sharedpreferences.SharedPreferencesPlugin$clear$1", f = "SharedPreferencesPlugin.kt", l = {TsExtractor.TS_STREAM_TYPE_SPLICE_INFO}, m = "invokeSuspend")
    public static final class AnonymousClass1 extends AbstractC1616j implements Function2<E, InterfaceC1526a<? super Preferences>, Object> {
        final /* synthetic */ List<String> $allowList;
        int label;

        /* JADX INFO: renamed from: io.flutter.plugins.sharedpreferences.SharedPreferencesPlugin$clear$1$1, reason: invalid class name and collision with other inner class name */
        @InterfaceC1611e(c = "io.flutter.plugins.sharedpreferences.SharedPreferencesPlugin$clear$1$1", f = "SharedPreferencesPlugin.kt", l = {}, m = "invokeSuspend")
        public static final class C00911 extends AbstractC1616j implements Function2<MutablePreferences, InterfaceC1526a<? super Unit>, Object> {
            final /* synthetic */ List<String> $allowList;
            /* synthetic */ Object L$0;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C00911(List<String> list, InterfaceC1526a<? super C00911> interfaceC1526a) {
                super(2, interfaceC1526a);
                this.$allowList = list;
            }

            @Override // ij.AbstractC1607a
            public final InterfaceC1526a<Unit> create(Object obj, InterfaceC1526a<?> interfaceC1526a) {
                C00911 c00911 = new C00911(this.$allowList, interfaceC1526a);
                c00911.L$0 = obj;
                return c00911;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(MutablePreferences mutablePreferences, InterfaceC1526a<? super Unit> interfaceC1526a) {
                return ((C00911) create(mutablePreferences, interfaceC1526a)).invokeSuspend(Unit.f18162a);
            }

            @Override // ij.AbstractC1607a
            public final Object invokeSuspend(Object obj) {
                EnumC1578a enumC1578a = EnumC1578a.f17050a;
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC1039j.b(obj);
                MutablePreferences mutablePreferences = (MutablePreferences) this.L$0;
                List<String> list = this.$allowList;
                if (list != null) {
                    Iterator<T> it = list.iterator();
                    while (it.hasNext()) {
                        mutablePreferences.remove(PreferencesKeys.booleanKey((String) it.next()));
                    }
                } else {
                    mutablePreferences.clear();
                }
                return Unit.f18162a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(List<String> list, InterfaceC1526a<? super AnonymousClass1> interfaceC1526a) {
            super(2, interfaceC1526a);
            this.$allowList = list;
        }

        @Override // ij.AbstractC1607a
        public final InterfaceC1526a<Unit> create(Object obj, InterfaceC1526a<?> interfaceC1526a) {
            return SharedPreferencesPlugin.this.new AnonymousClass1(this.$allowList, interfaceC1526a);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(E e, InterfaceC1526a<? super Preferences> interfaceC1526a) {
            return ((AnonymousClass1) create(e, interfaceC1526a)).invokeSuspend(Unit.f18162a);
        }

        @Override // ij.AbstractC1607a
        public final Object invokeSuspend(Object obj) {
            EnumC1578a enumC1578a = EnumC1578a.f17050a;
            int i = this.label;
            if (i != 0) {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC1039j.b(obj);
                return obj;
            }
            AbstractC1039j.b(obj);
            Context context = SharedPreferencesPlugin.this.context;
            if (context == null) {
                j.n("context");
                throw null;
            }
            DataStore<Preferences> sharedPreferencesDataStore = SharedPreferencesPluginKt.getSharedPreferencesDataStore(context);
            C00911 c00911 = new C00911(this.$allowList, null);
            this.label = 1;
            Object objEdit = PreferencesKt.edit(sharedPreferencesDataStore, c00911, this);
            return objEdit == enumC1578a ? enumC1578a : objEdit;
        }
    }

    /* JADX INFO: renamed from: io.flutter.plugins.sharedpreferences.SharedPreferencesPlugin$dataStoreSetString$2, reason: invalid class name */
    @InterfaceC1611e(c = "io.flutter.plugins.sharedpreferences.SharedPreferencesPlugin$dataStoreSetString$2", f = "SharedPreferencesPlugin.kt", l = {}, m = "invokeSuspend")
    public static final class AnonymousClass2 extends AbstractC1616j implements Function2<MutablePreferences, InterfaceC1526a<? super Unit>, Object> {
        final /* synthetic */ Preferences.Key<String> $stringKey;
        final /* synthetic */ String $value;
        /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(Preferences.Key<String> key, String str, InterfaceC1526a<? super AnonymousClass2> interfaceC1526a) {
            super(2, interfaceC1526a);
            this.$stringKey = key;
            this.$value = str;
        }

        @Override // ij.AbstractC1607a
        public final InterfaceC1526a<Unit> create(Object obj, InterfaceC1526a<?> interfaceC1526a) {
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.$stringKey, this.$value, interfaceC1526a);
            anonymousClass2.L$0 = obj;
            return anonymousClass2;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(MutablePreferences mutablePreferences, InterfaceC1526a<? super Unit> interfaceC1526a) {
            return ((AnonymousClass2) create(mutablePreferences, interfaceC1526a)).invokeSuspend(Unit.f18162a);
        }

        @Override // ij.AbstractC1607a
        public final Object invokeSuspend(Object obj) {
            EnumC1578a enumC1578a = EnumC1578a.f17050a;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC1039j.b(obj);
            ((MutablePreferences) this.L$0).set(this.$stringKey, this.$value);
            return Unit.f18162a;
        }
    }

    /* JADX INFO: renamed from: io.flutter.plugins.sharedpreferences.SharedPreferencesPlugin$getAll$1, reason: invalid class name and case insensitive filesystem */
    @InterfaceC1611e(c = "io.flutter.plugins.sharedpreferences.SharedPreferencesPlugin$getAll$1", f = "SharedPreferencesPlugin.kt", l = {ServerConfiguration.DEFAULT_MAX_BEACON_SIZE_KB_SAAS}, m = "invokeSuspend")
    public static final class C16231 extends AbstractC1616j implements Function2<E, InterfaceC1526a<? super Map<String, ? extends Object>>, Object> {
        final /* synthetic */ List<String> $allowList;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C16231(List<String> list, InterfaceC1526a<? super C16231> interfaceC1526a) {
            super(2, interfaceC1526a);
            this.$allowList = list;
        }

        @Override // ij.AbstractC1607a
        public final InterfaceC1526a<Unit> create(Object obj, InterfaceC1526a<?> interfaceC1526a) {
            return SharedPreferencesPlugin.this.new C16231(this.$allowList, interfaceC1526a);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(E e, InterfaceC1526a<? super Map<String, ? extends Object>> interfaceC1526a) {
            return ((C16231) create(e, interfaceC1526a)).invokeSuspend(Unit.f18162a);
        }

        @Override // ij.AbstractC1607a
        public final Object invokeSuspend(Object obj) {
            EnumC1578a enumC1578a = EnumC1578a.f17050a;
            int i = this.label;
            if (i != 0) {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC1039j.b(obj);
                return obj;
            }
            AbstractC1039j.b(obj);
            SharedPreferencesPlugin sharedPreferencesPlugin = SharedPreferencesPlugin.this;
            List<String> list = this.$allowList;
            this.label = 1;
            Object prefs = sharedPreferencesPlugin.getPrefs(list, this);
            return prefs == enumC1578a ? enumC1578a : prefs;
        }
    }

    /* JADX INFO: renamed from: io.flutter.plugins.sharedpreferences.SharedPreferencesPlugin$getBool$1, reason: invalid class name and case insensitive filesystem */
    @InterfaceC1611e(c = "io.flutter.plugins.sharedpreferences.SharedPreferencesPlugin$getBool$1", f = "SharedPreferencesPlugin.kt", l = {174}, m = "invokeSuspend")
    public static final class C16241 extends AbstractC1616j implements Function2<E, InterfaceC1526a<? super Unit>, Object> {
        final /* synthetic */ String $key;
        final /* synthetic */ y $value;
        Object L$0;
        int label;
        final /* synthetic */ SharedPreferencesPlugin this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C16241(String str, SharedPreferencesPlugin sharedPreferencesPlugin, y yVar, InterfaceC1526a<? super C16241> interfaceC1526a) {
            super(2, interfaceC1526a);
            this.$key = str;
            this.this$0 = sharedPreferencesPlugin;
            this.$value = yVar;
        }

        @Override // ij.AbstractC1607a
        public final InterfaceC1526a<Unit> create(Object obj, InterfaceC1526a<?> interfaceC1526a) {
            return new C16241(this.$key, this.this$0, this.$value, interfaceC1526a);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(E e, InterfaceC1526a<? super Unit> interfaceC1526a) {
            return ((C16241) create(e, interfaceC1526a)).invokeSuspend(Unit.f18162a);
        }

        @Override // ij.AbstractC1607a
        public final Object invokeSuspend(Object obj) {
            y yVar;
            EnumC1578a enumC1578a = EnumC1578a.f17050a;
            int i = this.label;
            if (i == 0) {
                AbstractC1039j.b(obj);
                final Preferences.Key<Boolean> keyBooleanKey = PreferencesKeys.booleanKey(this.$key);
                Context context = this.this$0.context;
                if (context == null) {
                    j.n("context");
                    throw null;
                }
                final InterfaceC0230h data = SharedPreferencesPluginKt.getSharedPreferencesDataStore(context).getData();
                InterfaceC0230h interfaceC0230h = new InterfaceC0230h() { // from class: io.flutter.plugins.sharedpreferences.SharedPreferencesPlugin$getBool$1$invokeSuspend$$inlined$map$1

                    /* JADX INFO: renamed from: io.flutter.plugins.sharedpreferences.SharedPreferencesPlugin$getBool$1$invokeSuspend$$inlined$map$1$2, reason: invalid class name */
                    public static final class AnonymousClass2<T> implements InterfaceC0231i {
                        final /* synthetic */ Preferences.Key $preferencesKey$inlined;
                        final /* synthetic */ InterfaceC0231i $this_unsafeFlow;

                        /* JADX INFO: renamed from: io.flutter.plugins.sharedpreferences.SharedPreferencesPlugin$getBool$1$invokeSuspend$$inlined$map$1$2$1, reason: invalid class name */
                        @InterfaceC1611e(c = "io.flutter.plugins.sharedpreferences.SharedPreferencesPlugin$getBool$1$invokeSuspend$$inlined$map$1$2", f = "SharedPreferencesPlugin.kt", l = {MfaTencentErrorResult.TENCENT_ERROR_PREPARE_TIME_OUT}, m = "emit")
                        public static final class AnonymousClass1 extends AbstractC1609c {
                            Object L$0;
                            int label;
                            /* synthetic */ Object result;

                            public AnonymousClass1(InterfaceC1526a interfaceC1526a) {
                                super(interfaceC1526a);
                            }

                            @Override // ij.AbstractC1607a
                            public final Object invokeSuspend(Object obj) {
                                this.result = obj;
                                this.label |= Integer.MIN_VALUE;
                                return AnonymousClass2.this.emit(null, this);
                            }
                        }

                        public AnonymousClass2(InterfaceC0231i interfaceC0231i, Preferences.Key key) {
                            this.$this_unsafeFlow = interfaceC0231i;
                            this.$preferencesKey$inlined = key;
                        }

                        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
                        @Override // Ej.InterfaceC0231i
                        /*
                            Code decompiled incorrectly, please refer to instructions dump.
                            To view partially-correct add '--show-bad-code' argument
                        */
                        public final java.lang.Object emit(java.lang.Object r5, gj.InterfaceC1526a r6) {
                            /*
                                r4 = this;
                                boolean r0 = r6 instanceof io.flutter.plugins.sharedpreferences.SharedPreferencesPlugin$getBool$1$invokeSuspend$$inlined$map$1.AnonymousClass2.AnonymousClass1
                                if (r0 == 0) goto L13
                                r0 = r6
                                io.flutter.plugins.sharedpreferences.SharedPreferencesPlugin$getBool$1$invokeSuspend$$inlined$map$1$2$1 r0 = (io.flutter.plugins.sharedpreferences.SharedPreferencesPlugin$getBool$1$invokeSuspend$$inlined$map$1.AnonymousClass2.AnonymousClass1) r0
                                int r1 = r0.label
                                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                                r3 = r1 & r2
                                if (r3 == 0) goto L13
                                int r1 = r1 - r2
                                r0.label = r1
                                goto L18
                            L13:
                                io.flutter.plugins.sharedpreferences.SharedPreferencesPlugin$getBool$1$invokeSuspend$$inlined$map$1$2$1 r0 = new io.flutter.plugins.sharedpreferences.SharedPreferencesPlugin$getBool$1$invokeSuspend$$inlined$map$1$2$1
                                r0.<init>(r6)
                            L18:
                                java.lang.Object r6 = r0.result
                                hj.a r1 = hj.EnumC1578a.f17050a
                                int r2 = r0.label
                                r3 = 1
                                if (r2 == 0) goto L2f
                                if (r2 != r3) goto L27
                                bj.AbstractC1039j.b(r6)
                                goto L45
                            L27:
                                java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                                java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                                r5.<init>(r6)
                                throw r5
                            L2f:
                                bj.AbstractC1039j.b(r6)
                                Ej.i r6 = r4.$this_unsafeFlow
                                androidx.datastore.preferences.core.Preferences r5 = (androidx.datastore.preferences.core.Preferences) r5
                                androidx.datastore.preferences.core.Preferences$Key r2 = r4.$preferencesKey$inlined
                                java.lang.Object r5 = r5.get(r2)
                                r0.label = r3
                                java.lang.Object r5 = r6.emit(r5, r0)
                                if (r5 != r1) goto L45
                                return r1
                            L45:
                                kotlin.Unit r5 = kotlin.Unit.f18162a
                                return r5
                            */
                            throw new UnsupportedOperationException("Method not decompiled: io.flutter.plugins.sharedpreferences.SharedPreferencesPlugin$getBool$1$invokeSuspend$$inlined$map$1.AnonymousClass2.emit(java.lang.Object, gj.a):java.lang.Object");
                        }
                    }

                    @Override // Ej.InterfaceC0230h
                    public Object collect(InterfaceC0231i interfaceC0231i, InterfaceC1526a interfaceC1526a) {
                        Object objCollect = data.collect(new AnonymousClass2(interfaceC0231i, keyBooleanKey), interfaceC1526a);
                        return objCollect == EnumC1578a.f17050a ? objCollect : Unit.f18162a;
                    }
                };
                y yVar2 = this.$value;
                this.L$0 = yVar2;
                this.label = 1;
                Object objL = W.l(interfaceC0230h, this);
                if (objL == enumC1578a) {
                    return enumC1578a;
                }
                yVar = yVar2;
                obj = objL;
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                yVar = (y) this.L$0;
                AbstractC1039j.b(obj);
            }
            yVar.f18195a = obj;
            return Unit.f18162a;
        }
    }

    /* JADX INFO: renamed from: io.flutter.plugins.sharedpreferences.SharedPreferencesPlugin$getDouble$1, reason: invalid class name and case insensitive filesystem */
    @InterfaceC1611e(c = "io.flutter.plugins.sharedpreferences.SharedPreferencesPlugin$getDouble$1", f = "SharedPreferencesPlugin.kt", l = {TsExtractor.TS_PACKET_SIZE}, m = "invokeSuspend")
    public static final class C16251 extends AbstractC1616j implements Function2<E, InterfaceC1526a<? super Unit>, Object> {
        final /* synthetic */ String $key;
        final /* synthetic */ y $value;
        Object L$0;
        int label;
        final /* synthetic */ SharedPreferencesPlugin this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C16251(String str, SharedPreferencesPlugin sharedPreferencesPlugin, y yVar, InterfaceC1526a<? super C16251> interfaceC1526a) {
            super(2, interfaceC1526a);
            this.$key = str;
            this.this$0 = sharedPreferencesPlugin;
            this.$value = yVar;
        }

        @Override // ij.AbstractC1607a
        public final InterfaceC1526a<Unit> create(Object obj, InterfaceC1526a<?> interfaceC1526a) {
            return new C16251(this.$key, this.this$0, this.$value, interfaceC1526a);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(E e, InterfaceC1526a<? super Unit> interfaceC1526a) {
            return ((C16251) create(e, interfaceC1526a)).invokeSuspend(Unit.f18162a);
        }

        @Override // ij.AbstractC1607a
        public final Object invokeSuspend(Object obj) {
            y yVar;
            EnumC1578a enumC1578a = EnumC1578a.f17050a;
            int i = this.label;
            if (i == 0) {
                AbstractC1039j.b(obj);
                final Preferences.Key<String> keyStringKey = PreferencesKeys.stringKey(this.$key);
                Context context = this.this$0.context;
                if (context == null) {
                    j.n("context");
                    throw null;
                }
                final InterfaceC0230h data = SharedPreferencesPluginKt.getSharedPreferencesDataStore(context).getData();
                final SharedPreferencesPlugin sharedPreferencesPlugin = this.this$0;
                InterfaceC0230h interfaceC0230h = new InterfaceC0230h() { // from class: io.flutter.plugins.sharedpreferences.SharedPreferencesPlugin$getDouble$1$invokeSuspend$$inlined$map$1

                    /* JADX INFO: renamed from: io.flutter.plugins.sharedpreferences.SharedPreferencesPlugin$getDouble$1$invokeSuspend$$inlined$map$1$2, reason: invalid class name */
                    public static final class AnonymousClass2<T> implements InterfaceC0231i {
                        final /* synthetic */ Preferences.Key $preferencesKey$inlined;
                        final /* synthetic */ InterfaceC0231i $this_unsafeFlow;
                        final /* synthetic */ SharedPreferencesPlugin this$0;

                        /* JADX INFO: renamed from: io.flutter.plugins.sharedpreferences.SharedPreferencesPlugin$getDouble$1$invokeSuspend$$inlined$map$1$2$1, reason: invalid class name */
                        @InterfaceC1611e(c = "io.flutter.plugins.sharedpreferences.SharedPreferencesPlugin$getDouble$1$invokeSuspend$$inlined$map$1$2", f = "SharedPreferencesPlugin.kt", l = {MfaTencentErrorResult.TENCENT_ERROR_PREPARE_TIME_OUT}, m = "emit")
                        public static final class AnonymousClass1 extends AbstractC1609c {
                            Object L$0;
                            int label;
                            /* synthetic */ Object result;

                            public AnonymousClass1(InterfaceC1526a interfaceC1526a) {
                                super(interfaceC1526a);
                            }

                            @Override // ij.AbstractC1607a
                            public final Object invokeSuspend(Object obj) {
                                this.result = obj;
                                this.label |= Integer.MIN_VALUE;
                                return AnonymousClass2.this.emit(null, this);
                            }
                        }

                        public AnonymousClass2(InterfaceC0231i interfaceC0231i, Preferences.Key key, SharedPreferencesPlugin sharedPreferencesPlugin) {
                            this.$this_unsafeFlow = interfaceC0231i;
                            this.$preferencesKey$inlined = key;
                            this.this$0 = sharedPreferencesPlugin;
                        }

                        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
                        @Override // Ej.InterfaceC0231i
                        /*
                            Code decompiled incorrectly, please refer to instructions dump.
                            To view partially-correct add '--show-bad-code' argument
                        */
                        public final java.lang.Object emit(java.lang.Object r5, gj.InterfaceC1526a r6) {
                            /*
                                r4 = this;
                                boolean r0 = r6 instanceof io.flutter.plugins.sharedpreferences.SharedPreferencesPlugin$getDouble$1$invokeSuspend$$inlined$map$1.AnonymousClass2.AnonymousClass1
                                if (r0 == 0) goto L13
                                r0 = r6
                                io.flutter.plugins.sharedpreferences.SharedPreferencesPlugin$getDouble$1$invokeSuspend$$inlined$map$1$2$1 r0 = (io.flutter.plugins.sharedpreferences.SharedPreferencesPlugin$getDouble$1$invokeSuspend$$inlined$map$1.AnonymousClass2.AnonymousClass1) r0
                                int r1 = r0.label
                                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                                r3 = r1 & r2
                                if (r3 == 0) goto L13
                                int r1 = r1 - r2
                                r0.label = r1
                                goto L18
                            L13:
                                io.flutter.plugins.sharedpreferences.SharedPreferencesPlugin$getDouble$1$invokeSuspend$$inlined$map$1$2$1 r0 = new io.flutter.plugins.sharedpreferences.SharedPreferencesPlugin$getDouble$1$invokeSuspend$$inlined$map$1$2$1
                                r0.<init>(r6)
                            L18:
                                java.lang.Object r6 = r0.result
                                hj.a r1 = hj.EnumC1578a.f17050a
                                int r2 = r0.label
                                r3 = 1
                                if (r2 == 0) goto L2f
                                if (r2 != r3) goto L27
                                bj.AbstractC1039j.b(r6)
                                goto L51
                            L27:
                                java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                                java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                                r5.<init>(r6)
                                throw r5
                            L2f:
                                bj.AbstractC1039j.b(r6)
                                Ej.i r6 = r4.$this_unsafeFlow
                                androidx.datastore.preferences.core.Preferences r5 = (androidx.datastore.preferences.core.Preferences) r5
                                androidx.datastore.preferences.core.Preferences$Key r2 = r4.$preferencesKey$inlined
                                java.lang.Object r5 = r5.get(r2)
                                io.flutter.plugins.sharedpreferences.SharedPreferencesPlugin r2 = r4.this$0
                                io.flutter.plugins.sharedpreferences.SharedPreferencesListEncoder r2 = io.flutter.plugins.sharedpreferences.SharedPreferencesPlugin.access$getListEncoder$p(r2)
                                java.lang.Object r5 = io.flutter.plugins.sharedpreferences.SharedPreferencesPluginKt.transformPref(r5, r2)
                                java.lang.Double r5 = (java.lang.Double) r5
                                r0.label = r3
                                java.lang.Object r5 = r6.emit(r5, r0)
                                if (r5 != r1) goto L51
                                return r1
                            L51:
                                kotlin.Unit r5 = kotlin.Unit.f18162a
                                return r5
                            */
                            throw new UnsupportedOperationException("Method not decompiled: io.flutter.plugins.sharedpreferences.SharedPreferencesPlugin$getDouble$1$invokeSuspend$$inlined$map$1.AnonymousClass2.emit(java.lang.Object, gj.a):java.lang.Object");
                        }
                    }

                    @Override // Ej.InterfaceC0230h
                    public Object collect(InterfaceC0231i interfaceC0231i, InterfaceC1526a interfaceC1526a) {
                        Object objCollect = data.collect(new AnonymousClass2(interfaceC0231i, keyStringKey, sharedPreferencesPlugin), interfaceC1526a);
                        return objCollect == EnumC1578a.f17050a ? objCollect : Unit.f18162a;
                    }
                };
                y yVar2 = this.$value;
                this.L$0 = yVar2;
                this.label = 1;
                Object objL = W.l(interfaceC0230h, this);
                if (objL == enumC1578a) {
                    return enumC1578a;
                }
                yVar = yVar2;
                obj = objL;
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                yVar = (y) this.L$0;
                AbstractC1039j.b(obj);
            }
            yVar.f18195a = obj;
            return Unit.f18162a;
        }
    }

    /* JADX INFO: renamed from: io.flutter.plugins.sharedpreferences.SharedPreferencesPlugin$getInt$1, reason: invalid class name and case insensitive filesystem */
    @InterfaceC1611e(c = "io.flutter.plugins.sharedpreferences.SharedPreferencesPlugin$getInt$1", f = "SharedPreferencesPlugin.kt", l = {160}, m = "invokeSuspend")
    public static final class C16261 extends AbstractC1616j implements Function2<E, InterfaceC1526a<? super Unit>, Object> {
        final /* synthetic */ String $key;
        final /* synthetic */ y $value;
        Object L$0;
        int label;
        final /* synthetic */ SharedPreferencesPlugin this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C16261(String str, SharedPreferencesPlugin sharedPreferencesPlugin, y yVar, InterfaceC1526a<? super C16261> interfaceC1526a) {
            super(2, interfaceC1526a);
            this.$key = str;
            this.this$0 = sharedPreferencesPlugin;
            this.$value = yVar;
        }

        @Override // ij.AbstractC1607a
        public final InterfaceC1526a<Unit> create(Object obj, InterfaceC1526a<?> interfaceC1526a) {
            return new C16261(this.$key, this.this$0, this.$value, interfaceC1526a);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(E e, InterfaceC1526a<? super Unit> interfaceC1526a) {
            return ((C16261) create(e, interfaceC1526a)).invokeSuspend(Unit.f18162a);
        }

        @Override // ij.AbstractC1607a
        public final Object invokeSuspend(Object obj) {
            y yVar;
            EnumC1578a enumC1578a = EnumC1578a.f17050a;
            int i = this.label;
            if (i == 0) {
                AbstractC1039j.b(obj);
                final Preferences.Key<Long> keyLongKey = PreferencesKeys.longKey(this.$key);
                Context context = this.this$0.context;
                if (context == null) {
                    j.n("context");
                    throw null;
                }
                final InterfaceC0230h data = SharedPreferencesPluginKt.getSharedPreferencesDataStore(context).getData();
                InterfaceC0230h interfaceC0230h = new InterfaceC0230h() { // from class: io.flutter.plugins.sharedpreferences.SharedPreferencesPlugin$getInt$1$invokeSuspend$$inlined$map$1

                    /* JADX INFO: renamed from: io.flutter.plugins.sharedpreferences.SharedPreferencesPlugin$getInt$1$invokeSuspend$$inlined$map$1$2, reason: invalid class name */
                    public static final class AnonymousClass2<T> implements InterfaceC0231i {
                        final /* synthetic */ Preferences.Key $preferencesKey$inlined;
                        final /* synthetic */ InterfaceC0231i $this_unsafeFlow;

                        /* JADX INFO: renamed from: io.flutter.plugins.sharedpreferences.SharedPreferencesPlugin$getInt$1$invokeSuspend$$inlined$map$1$2$1, reason: invalid class name */
                        @InterfaceC1611e(c = "io.flutter.plugins.sharedpreferences.SharedPreferencesPlugin$getInt$1$invokeSuspend$$inlined$map$1$2", f = "SharedPreferencesPlugin.kt", l = {MfaTencentErrorResult.TENCENT_ERROR_PREPARE_TIME_OUT}, m = "emit")
                        public static final class AnonymousClass1 extends AbstractC1609c {
                            Object L$0;
                            int label;
                            /* synthetic */ Object result;

                            public AnonymousClass1(InterfaceC1526a interfaceC1526a) {
                                super(interfaceC1526a);
                            }

                            @Override // ij.AbstractC1607a
                            public final Object invokeSuspend(Object obj) {
                                this.result = obj;
                                this.label |= Integer.MIN_VALUE;
                                return AnonymousClass2.this.emit(null, this);
                            }
                        }

                        public AnonymousClass2(InterfaceC0231i interfaceC0231i, Preferences.Key key) {
                            this.$this_unsafeFlow = interfaceC0231i;
                            this.$preferencesKey$inlined = key;
                        }

                        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
                        @Override // Ej.InterfaceC0231i
                        /*
                            Code decompiled incorrectly, please refer to instructions dump.
                            To view partially-correct add '--show-bad-code' argument
                        */
                        public final java.lang.Object emit(java.lang.Object r5, gj.InterfaceC1526a r6) {
                            /*
                                r4 = this;
                                boolean r0 = r6 instanceof io.flutter.plugins.sharedpreferences.SharedPreferencesPlugin$getInt$1$invokeSuspend$$inlined$map$1.AnonymousClass2.AnonymousClass1
                                if (r0 == 0) goto L13
                                r0 = r6
                                io.flutter.plugins.sharedpreferences.SharedPreferencesPlugin$getInt$1$invokeSuspend$$inlined$map$1$2$1 r0 = (io.flutter.plugins.sharedpreferences.SharedPreferencesPlugin$getInt$1$invokeSuspend$$inlined$map$1.AnonymousClass2.AnonymousClass1) r0
                                int r1 = r0.label
                                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                                r3 = r1 & r2
                                if (r3 == 0) goto L13
                                int r1 = r1 - r2
                                r0.label = r1
                                goto L18
                            L13:
                                io.flutter.plugins.sharedpreferences.SharedPreferencesPlugin$getInt$1$invokeSuspend$$inlined$map$1$2$1 r0 = new io.flutter.plugins.sharedpreferences.SharedPreferencesPlugin$getInt$1$invokeSuspend$$inlined$map$1$2$1
                                r0.<init>(r6)
                            L18:
                                java.lang.Object r6 = r0.result
                                hj.a r1 = hj.EnumC1578a.f17050a
                                int r2 = r0.label
                                r3 = 1
                                if (r2 == 0) goto L2f
                                if (r2 != r3) goto L27
                                bj.AbstractC1039j.b(r6)
                                goto L45
                            L27:
                                java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                                java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                                r5.<init>(r6)
                                throw r5
                            L2f:
                                bj.AbstractC1039j.b(r6)
                                Ej.i r6 = r4.$this_unsafeFlow
                                androidx.datastore.preferences.core.Preferences r5 = (androidx.datastore.preferences.core.Preferences) r5
                                androidx.datastore.preferences.core.Preferences$Key r2 = r4.$preferencesKey$inlined
                                java.lang.Object r5 = r5.get(r2)
                                r0.label = r3
                                java.lang.Object r5 = r6.emit(r5, r0)
                                if (r5 != r1) goto L45
                                return r1
                            L45:
                                kotlin.Unit r5 = kotlin.Unit.f18162a
                                return r5
                            */
                            throw new UnsupportedOperationException("Method not decompiled: io.flutter.plugins.sharedpreferences.SharedPreferencesPlugin$getInt$1$invokeSuspend$$inlined$map$1.AnonymousClass2.emit(java.lang.Object, gj.a):java.lang.Object");
                        }
                    }

                    @Override // Ej.InterfaceC0230h
                    public Object collect(InterfaceC0231i interfaceC0231i, InterfaceC1526a interfaceC1526a) {
                        Object objCollect = data.collect(new AnonymousClass2(interfaceC0231i, keyLongKey), interfaceC1526a);
                        return objCollect == EnumC1578a.f17050a ? objCollect : Unit.f18162a;
                    }
                };
                y yVar2 = this.$value;
                this.L$0 = yVar2;
                this.label = 1;
                Object objL = W.l(interfaceC0230h, this);
                if (objL == enumC1578a) {
                    return enumC1578a;
                }
                yVar = yVar2;
                obj = objL;
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                yVar = (y) this.L$0;
                AbstractC1039j.b(obj);
            }
            yVar.f18195a = obj;
            return Unit.f18162a;
        }
    }

    /* JADX INFO: renamed from: io.flutter.plugins.sharedpreferences.SharedPreferencesPlugin$getPrefs$1, reason: invalid class name and case insensitive filesystem */
    @InterfaceC1611e(c = "io.flutter.plugins.sharedpreferences.SharedPreferencesPlugin", f = "SharedPreferencesPlugin.kt", l = {256, MediaRouter.GlobalMediaRouter.CallbackHandler.MSG_ROUTE_REMOVED}, m = "getPrefs")
    public static final class C16271 extends AbstractC1609c {
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        int label;
        /* synthetic */ Object result;

        public C16271(InterfaceC1526a<? super C16271> interfaceC1526a) {
            super(interfaceC1526a);
        }

        @Override // ij.AbstractC1607a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return SharedPreferencesPlugin.this.getPrefs(null, this);
        }
    }

    /* JADX INFO: renamed from: io.flutter.plugins.sharedpreferences.SharedPreferencesPlugin$getString$1, reason: invalid class name and case insensitive filesystem */
    @InterfaceC1611e(c = "io.flutter.plugins.sharedpreferences.SharedPreferencesPlugin$getString$1", f = "SharedPreferencesPlugin.kt", l = {201}, m = "invokeSuspend")
    public static final class C16281 extends AbstractC1616j implements Function2<E, InterfaceC1526a<? super Unit>, Object> {
        final /* synthetic */ String $key;
        final /* synthetic */ y $value;
        Object L$0;
        int label;
        final /* synthetic */ SharedPreferencesPlugin this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C16281(String str, SharedPreferencesPlugin sharedPreferencesPlugin, y yVar, InterfaceC1526a<? super C16281> interfaceC1526a) {
            super(2, interfaceC1526a);
            this.$key = str;
            this.this$0 = sharedPreferencesPlugin;
            this.$value = yVar;
        }

        @Override // ij.AbstractC1607a
        public final InterfaceC1526a<Unit> create(Object obj, InterfaceC1526a<?> interfaceC1526a) {
            return new C16281(this.$key, this.this$0, this.$value, interfaceC1526a);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(E e, InterfaceC1526a<? super Unit> interfaceC1526a) {
            return ((C16281) create(e, interfaceC1526a)).invokeSuspend(Unit.f18162a);
        }

        @Override // ij.AbstractC1607a
        public final Object invokeSuspend(Object obj) {
            y yVar;
            EnumC1578a enumC1578a = EnumC1578a.f17050a;
            int i = this.label;
            if (i == 0) {
                AbstractC1039j.b(obj);
                final Preferences.Key<String> keyStringKey = PreferencesKeys.stringKey(this.$key);
                Context context = this.this$0.context;
                if (context == null) {
                    j.n("context");
                    throw null;
                }
                final InterfaceC0230h data = SharedPreferencesPluginKt.getSharedPreferencesDataStore(context).getData();
                InterfaceC0230h interfaceC0230h = new InterfaceC0230h() { // from class: io.flutter.plugins.sharedpreferences.SharedPreferencesPlugin$getString$1$invokeSuspend$$inlined$map$1

                    /* JADX INFO: renamed from: io.flutter.plugins.sharedpreferences.SharedPreferencesPlugin$getString$1$invokeSuspend$$inlined$map$1$2, reason: invalid class name */
                    public static final class AnonymousClass2<T> implements InterfaceC0231i {
                        final /* synthetic */ Preferences.Key $preferencesKey$inlined;
                        final /* synthetic */ InterfaceC0231i $this_unsafeFlow;

                        /* JADX INFO: renamed from: io.flutter.plugins.sharedpreferences.SharedPreferencesPlugin$getString$1$invokeSuspend$$inlined$map$1$2$1, reason: invalid class name */
                        @InterfaceC1611e(c = "io.flutter.plugins.sharedpreferences.SharedPreferencesPlugin$getString$1$invokeSuspend$$inlined$map$1$2", f = "SharedPreferencesPlugin.kt", l = {MfaTencentErrorResult.TENCENT_ERROR_PREPARE_TIME_OUT}, m = "emit")
                        public static final class AnonymousClass1 extends AbstractC1609c {
                            Object L$0;
                            int label;
                            /* synthetic */ Object result;

                            public AnonymousClass1(InterfaceC1526a interfaceC1526a) {
                                super(interfaceC1526a);
                            }

                            @Override // ij.AbstractC1607a
                            public final Object invokeSuspend(Object obj) {
                                this.result = obj;
                                this.label |= Integer.MIN_VALUE;
                                return AnonymousClass2.this.emit(null, this);
                            }
                        }

                        public AnonymousClass2(InterfaceC0231i interfaceC0231i, Preferences.Key key) {
                            this.$this_unsafeFlow = interfaceC0231i;
                            this.$preferencesKey$inlined = key;
                        }

                        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
                        @Override // Ej.InterfaceC0231i
                        /*
                            Code decompiled incorrectly, please refer to instructions dump.
                            To view partially-correct add '--show-bad-code' argument
                        */
                        public final java.lang.Object emit(java.lang.Object r5, gj.InterfaceC1526a r6) {
                            /*
                                r4 = this;
                                boolean r0 = r6 instanceof io.flutter.plugins.sharedpreferences.SharedPreferencesPlugin$getString$1$invokeSuspend$$inlined$map$1.AnonymousClass2.AnonymousClass1
                                if (r0 == 0) goto L13
                                r0 = r6
                                io.flutter.plugins.sharedpreferences.SharedPreferencesPlugin$getString$1$invokeSuspend$$inlined$map$1$2$1 r0 = (io.flutter.plugins.sharedpreferences.SharedPreferencesPlugin$getString$1$invokeSuspend$$inlined$map$1.AnonymousClass2.AnonymousClass1) r0
                                int r1 = r0.label
                                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                                r3 = r1 & r2
                                if (r3 == 0) goto L13
                                int r1 = r1 - r2
                                r0.label = r1
                                goto L18
                            L13:
                                io.flutter.plugins.sharedpreferences.SharedPreferencesPlugin$getString$1$invokeSuspend$$inlined$map$1$2$1 r0 = new io.flutter.plugins.sharedpreferences.SharedPreferencesPlugin$getString$1$invokeSuspend$$inlined$map$1$2$1
                                r0.<init>(r6)
                            L18:
                                java.lang.Object r6 = r0.result
                                hj.a r1 = hj.EnumC1578a.f17050a
                                int r2 = r0.label
                                r3 = 1
                                if (r2 == 0) goto L2f
                                if (r2 != r3) goto L27
                                bj.AbstractC1039j.b(r6)
                                goto L45
                            L27:
                                java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                                java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                                r5.<init>(r6)
                                throw r5
                            L2f:
                                bj.AbstractC1039j.b(r6)
                                Ej.i r6 = r4.$this_unsafeFlow
                                androidx.datastore.preferences.core.Preferences r5 = (androidx.datastore.preferences.core.Preferences) r5
                                androidx.datastore.preferences.core.Preferences$Key r2 = r4.$preferencesKey$inlined
                                java.lang.Object r5 = r5.get(r2)
                                r0.label = r3
                                java.lang.Object r5 = r6.emit(r5, r0)
                                if (r5 != r1) goto L45
                                return r1
                            L45:
                                kotlin.Unit r5 = kotlin.Unit.f18162a
                                return r5
                            */
                            throw new UnsupportedOperationException("Method not decompiled: io.flutter.plugins.sharedpreferences.SharedPreferencesPlugin$getString$1$invokeSuspend$$inlined$map$1.AnonymousClass2.emit(java.lang.Object, gj.a):java.lang.Object");
                        }
                    }

                    @Override // Ej.InterfaceC0230h
                    public Object collect(InterfaceC0231i interfaceC0231i, InterfaceC1526a interfaceC1526a) {
                        Object objCollect = data.collect(new AnonymousClass2(interfaceC0231i, keyStringKey), interfaceC1526a);
                        return objCollect == EnumC1578a.f17050a ? objCollect : Unit.f18162a;
                    }
                };
                y yVar2 = this.$value;
                this.L$0 = yVar2;
                this.label = 1;
                Object objL = W.l(interfaceC0230h, this);
                if (objL == enumC1578a) {
                    return enumC1578a;
                }
                yVar = yVar2;
                obj = objL;
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                yVar = (y) this.L$0;
                AbstractC1039j.b(obj);
            }
            yVar.f18195a = obj;
            return Unit.f18162a;
        }
    }

    /* JADX INFO: renamed from: io.flutter.plugins.sharedpreferences.SharedPreferencesPlugin$setBool$1, reason: invalid class name and case insensitive filesystem */
    @InterfaceC1611e(c = "io.flutter.plugins.sharedpreferences.SharedPreferencesPlugin$setBool$1", f = "SharedPreferencesPlugin.kt", l = {81}, m = "invokeSuspend")
    public static final class C16291 extends AbstractC1616j implements Function2<E, InterfaceC1526a<? super Unit>, Object> {
        final /* synthetic */ String $key;
        final /* synthetic */ boolean $value;
        int label;
        final /* synthetic */ SharedPreferencesPlugin this$0;

        /* JADX INFO: renamed from: io.flutter.plugins.sharedpreferences.SharedPreferencesPlugin$setBool$1$1, reason: invalid class name and collision with other inner class name */
        @InterfaceC1611e(c = "io.flutter.plugins.sharedpreferences.SharedPreferencesPlugin$setBool$1$1", f = "SharedPreferencesPlugin.kt", l = {}, m = "invokeSuspend")
        public static final class C00921 extends AbstractC1616j implements Function2<MutablePreferences, InterfaceC1526a<? super Unit>, Object> {
            final /* synthetic */ Preferences.Key<Boolean> $boolKey;
            final /* synthetic */ boolean $value;
            /* synthetic */ Object L$0;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C00921(Preferences.Key<Boolean> key, boolean z4, InterfaceC1526a<? super C00921> interfaceC1526a) {
                super(2, interfaceC1526a);
                this.$boolKey = key;
                this.$value = z4;
            }

            @Override // ij.AbstractC1607a
            public final InterfaceC1526a<Unit> create(Object obj, InterfaceC1526a<?> interfaceC1526a) {
                C00921 c00921 = new C00921(this.$boolKey, this.$value, interfaceC1526a);
                c00921.L$0 = obj;
                return c00921;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(MutablePreferences mutablePreferences, InterfaceC1526a<? super Unit> interfaceC1526a) {
                return ((C00921) create(mutablePreferences, interfaceC1526a)).invokeSuspend(Unit.f18162a);
            }

            @Override // ij.AbstractC1607a
            public final Object invokeSuspend(Object obj) {
                EnumC1578a enumC1578a = EnumC1578a.f17050a;
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC1039j.b(obj);
                ((MutablePreferences) this.L$0).set(this.$boolKey, Boolean.valueOf(this.$value));
                return Unit.f18162a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C16291(String str, SharedPreferencesPlugin sharedPreferencesPlugin, boolean z4, InterfaceC1526a<? super C16291> interfaceC1526a) {
            super(2, interfaceC1526a);
            this.$key = str;
            this.this$0 = sharedPreferencesPlugin;
            this.$value = z4;
        }

        @Override // ij.AbstractC1607a
        public final InterfaceC1526a<Unit> create(Object obj, InterfaceC1526a<?> interfaceC1526a) {
            return new C16291(this.$key, this.this$0, this.$value, interfaceC1526a);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(E e, InterfaceC1526a<? super Unit> interfaceC1526a) {
            return ((C16291) create(e, interfaceC1526a)).invokeSuspend(Unit.f18162a);
        }

        @Override // ij.AbstractC1607a
        public final Object invokeSuspend(Object obj) {
            EnumC1578a enumC1578a = EnumC1578a.f17050a;
            int i = this.label;
            if (i == 0) {
                AbstractC1039j.b(obj);
                Preferences.Key<Boolean> keyBooleanKey = PreferencesKeys.booleanKey(this.$key);
                Context context = this.this$0.context;
                if (context == null) {
                    j.n("context");
                    throw null;
                }
                DataStore<Preferences> sharedPreferencesDataStore = SharedPreferencesPluginKt.getSharedPreferencesDataStore(context);
                C00921 c00921 = new C00921(keyBooleanKey, this.$value, null);
                this.label = 1;
                if (PreferencesKt.edit(sharedPreferencesDataStore, c00921, this) == enumC1578a) {
                    return enumC1578a;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC1039j.b(obj);
            }
            return Unit.f18162a;
        }
    }

    /* JADX INFO: renamed from: io.flutter.plugins.sharedpreferences.SharedPreferencesPlugin$setDeprecatedStringList$1, reason: invalid class name and case insensitive filesystem */
    @InterfaceC1611e(c = "io.flutter.plugins.sharedpreferences.SharedPreferencesPlugin$setDeprecatedStringList$1", f = "SharedPreferencesPlugin.kt", l = {128}, m = "invokeSuspend")
    public static final class C16301 extends AbstractC1616j implements Function2<E, InterfaceC1526a<? super Unit>, Object> {
        final /* synthetic */ String $key;
        final /* synthetic */ String $valueString;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C16301(String str, String str2, InterfaceC1526a<? super C16301> interfaceC1526a) {
            super(2, interfaceC1526a);
            this.$key = str;
            this.$valueString = str2;
        }

        @Override // ij.AbstractC1607a
        public final InterfaceC1526a<Unit> create(Object obj, InterfaceC1526a<?> interfaceC1526a) {
            return SharedPreferencesPlugin.this.new C16301(this.$key, this.$valueString, interfaceC1526a);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(E e, InterfaceC1526a<? super Unit> interfaceC1526a) {
            return ((C16301) create(e, interfaceC1526a)).invokeSuspend(Unit.f18162a);
        }

        @Override // ij.AbstractC1607a
        public final Object invokeSuspend(Object obj) {
            EnumC1578a enumC1578a = EnumC1578a.f17050a;
            int i = this.label;
            if (i == 0) {
                AbstractC1039j.b(obj);
                SharedPreferencesPlugin sharedPreferencesPlugin = SharedPreferencesPlugin.this;
                String str = this.$key;
                String str2 = this.$valueString;
                this.label = 1;
                if (sharedPreferencesPlugin.dataStoreSetString(str, str2, this) == enumC1578a) {
                    return enumC1578a;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC1039j.b(obj);
            }
            return Unit.f18162a;
        }
    }

    /* JADX INFO: renamed from: io.flutter.plugins.sharedpreferences.SharedPreferencesPlugin$setDouble$1, reason: invalid class name and case insensitive filesystem */
    @InterfaceC1611e(c = "io.flutter.plugins.sharedpreferences.SharedPreferencesPlugin$setDouble$1", f = "SharedPreferencesPlugin.kt", l = {107}, m = "invokeSuspend")
    public static final class C16311 extends AbstractC1616j implements Function2<E, InterfaceC1526a<? super Unit>, Object> {
        final /* synthetic */ String $key;
        final /* synthetic */ double $value;
        int label;
        final /* synthetic */ SharedPreferencesPlugin this$0;

        /* JADX INFO: renamed from: io.flutter.plugins.sharedpreferences.SharedPreferencesPlugin$setDouble$1$1, reason: invalid class name and collision with other inner class name */
        @InterfaceC1611e(c = "io.flutter.plugins.sharedpreferences.SharedPreferencesPlugin$setDouble$1$1", f = "SharedPreferencesPlugin.kt", l = {}, m = "invokeSuspend")
        public static final class C00931 extends AbstractC1616j implements Function2<MutablePreferences, InterfaceC1526a<? super Unit>, Object> {
            final /* synthetic */ Preferences.Key<Double> $doubleKey;
            final /* synthetic */ double $value;
            /* synthetic */ Object L$0;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C00931(Preferences.Key<Double> key, double d10, InterfaceC1526a<? super C00931> interfaceC1526a) {
                super(2, interfaceC1526a);
                this.$doubleKey = key;
                this.$value = d10;
            }

            @Override // ij.AbstractC1607a
            public final InterfaceC1526a<Unit> create(Object obj, InterfaceC1526a<?> interfaceC1526a) {
                C00931 c00931 = new C00931(this.$doubleKey, this.$value, interfaceC1526a);
                c00931.L$0 = obj;
                return c00931;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(MutablePreferences mutablePreferences, InterfaceC1526a<? super Unit> interfaceC1526a) {
                return ((C00931) create(mutablePreferences, interfaceC1526a)).invokeSuspend(Unit.f18162a);
            }

            @Override // ij.AbstractC1607a
            public final Object invokeSuspend(Object obj) {
                EnumC1578a enumC1578a = EnumC1578a.f17050a;
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC1039j.b(obj);
                ((MutablePreferences) this.L$0).set(this.$doubleKey, new Double(this.$value));
                return Unit.f18162a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C16311(String str, SharedPreferencesPlugin sharedPreferencesPlugin, double d10, InterfaceC1526a<? super C16311> interfaceC1526a) {
            super(2, interfaceC1526a);
            this.$key = str;
            this.this$0 = sharedPreferencesPlugin;
            this.$value = d10;
        }

        @Override // ij.AbstractC1607a
        public final InterfaceC1526a<Unit> create(Object obj, InterfaceC1526a<?> interfaceC1526a) {
            return new C16311(this.$key, this.this$0, this.$value, interfaceC1526a);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(E e, InterfaceC1526a<? super Unit> interfaceC1526a) {
            return ((C16311) create(e, interfaceC1526a)).invokeSuspend(Unit.f18162a);
        }

        @Override // ij.AbstractC1607a
        public final Object invokeSuspend(Object obj) {
            EnumC1578a enumC1578a = EnumC1578a.f17050a;
            int i = this.label;
            if (i == 0) {
                AbstractC1039j.b(obj);
                Preferences.Key<Double> keyDoubleKey = PreferencesKeys.doubleKey(this.$key);
                Context context = this.this$0.context;
                if (context == null) {
                    j.n("context");
                    throw null;
                }
                DataStore<Preferences> sharedPreferencesDataStore = SharedPreferencesPluginKt.getSharedPreferencesDataStore(context);
                C00931 c00931 = new C00931(keyDoubleKey, this.$value, null);
                this.label = 1;
                if (PreferencesKt.edit(sharedPreferencesDataStore, c00931, this) == enumC1578a) {
                    return enumC1578a;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC1039j.b(obj);
            }
            return Unit.f18162a;
        }
    }

    /* JADX INFO: renamed from: io.flutter.plugins.sharedpreferences.SharedPreferencesPlugin$setEncodedStringList$1, reason: invalid class name and case insensitive filesystem */
    @InterfaceC1611e(c = "io.flutter.plugins.sharedpreferences.SharedPreferencesPlugin$setEncodedStringList$1", f = "SharedPreferencesPlugin.kt", l = {117}, m = "invokeSuspend")
    public static final class C16321 extends AbstractC1616j implements Function2<E, InterfaceC1526a<? super Unit>, Object> {
        final /* synthetic */ String $key;
        final /* synthetic */ String $value;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C16321(String str, String str2, InterfaceC1526a<? super C16321> interfaceC1526a) {
            super(2, interfaceC1526a);
            this.$key = str;
            this.$value = str2;
        }

        @Override // ij.AbstractC1607a
        public final InterfaceC1526a<Unit> create(Object obj, InterfaceC1526a<?> interfaceC1526a) {
            return SharedPreferencesPlugin.this.new C16321(this.$key, this.$value, interfaceC1526a);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(E e, InterfaceC1526a<? super Unit> interfaceC1526a) {
            return ((C16321) create(e, interfaceC1526a)).invokeSuspend(Unit.f18162a);
        }

        @Override // ij.AbstractC1607a
        public final Object invokeSuspend(Object obj) {
            EnumC1578a enumC1578a = EnumC1578a.f17050a;
            int i = this.label;
            if (i == 0) {
                AbstractC1039j.b(obj);
                SharedPreferencesPlugin sharedPreferencesPlugin = SharedPreferencesPlugin.this;
                String str = this.$key;
                String str2 = this.$value;
                this.label = 1;
                if (sharedPreferencesPlugin.dataStoreSetString(str, str2, this) == enumC1578a) {
                    return enumC1578a;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC1039j.b(obj);
            }
            return Unit.f18162a;
        }
    }

    /* JADX INFO: renamed from: io.flutter.plugins.sharedpreferences.SharedPreferencesPlugin$setInt$1, reason: invalid class name and case insensitive filesystem */
    @InterfaceC1611e(c = "io.flutter.plugins.sharedpreferences.SharedPreferencesPlugin$setInt$1", f = "SharedPreferencesPlugin.kt", l = {99}, m = "invokeSuspend")
    public static final class C16331 extends AbstractC1616j implements Function2<E, InterfaceC1526a<? super Unit>, Object> {
        final /* synthetic */ String $key;
        final /* synthetic */ long $value;
        int label;
        final /* synthetic */ SharedPreferencesPlugin this$0;

        /* JADX INFO: renamed from: io.flutter.plugins.sharedpreferences.SharedPreferencesPlugin$setInt$1$1, reason: invalid class name and collision with other inner class name */
        @InterfaceC1611e(c = "io.flutter.plugins.sharedpreferences.SharedPreferencesPlugin$setInt$1$1", f = "SharedPreferencesPlugin.kt", l = {}, m = "invokeSuspend")
        public static final class C00941 extends AbstractC1616j implements Function2<MutablePreferences, InterfaceC1526a<? super Unit>, Object> {
            final /* synthetic */ Preferences.Key<Long> $intKey;
            final /* synthetic */ long $value;
            /* synthetic */ Object L$0;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C00941(Preferences.Key<Long> key, long j, InterfaceC1526a<? super C00941> interfaceC1526a) {
                super(2, interfaceC1526a);
                this.$intKey = key;
                this.$value = j;
            }

            @Override // ij.AbstractC1607a
            public final InterfaceC1526a<Unit> create(Object obj, InterfaceC1526a<?> interfaceC1526a) {
                C00941 c00941 = new C00941(this.$intKey, this.$value, interfaceC1526a);
                c00941.L$0 = obj;
                return c00941;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(MutablePreferences mutablePreferences, InterfaceC1526a<? super Unit> interfaceC1526a) {
                return ((C00941) create(mutablePreferences, interfaceC1526a)).invokeSuspend(Unit.f18162a);
            }

            @Override // ij.AbstractC1607a
            public final Object invokeSuspend(Object obj) {
                EnumC1578a enumC1578a = EnumC1578a.f17050a;
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC1039j.b(obj);
                ((MutablePreferences) this.L$0).set(this.$intKey, new Long(this.$value));
                return Unit.f18162a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C16331(String str, SharedPreferencesPlugin sharedPreferencesPlugin, long j, InterfaceC1526a<? super C16331> interfaceC1526a) {
            super(2, interfaceC1526a);
            this.$key = str;
            this.this$0 = sharedPreferencesPlugin;
            this.$value = j;
        }

        @Override // ij.AbstractC1607a
        public final InterfaceC1526a<Unit> create(Object obj, InterfaceC1526a<?> interfaceC1526a) {
            return new C16331(this.$key, this.this$0, this.$value, interfaceC1526a);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(E e, InterfaceC1526a<? super Unit> interfaceC1526a) {
            return ((C16331) create(e, interfaceC1526a)).invokeSuspend(Unit.f18162a);
        }

        @Override // ij.AbstractC1607a
        public final Object invokeSuspend(Object obj) {
            EnumC1578a enumC1578a = EnumC1578a.f17050a;
            int i = this.label;
            if (i == 0) {
                AbstractC1039j.b(obj);
                Preferences.Key<Long> keyLongKey = PreferencesKeys.longKey(this.$key);
                Context context = this.this$0.context;
                if (context == null) {
                    j.n("context");
                    throw null;
                }
                DataStore<Preferences> sharedPreferencesDataStore = SharedPreferencesPluginKt.getSharedPreferencesDataStore(context);
                C00941 c00941 = new C00941(keyLongKey, this.$value, null);
                this.label = 1;
                if (PreferencesKt.edit(sharedPreferencesDataStore, c00941, this) == enumC1578a) {
                    return enumC1578a;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC1039j.b(obj);
            }
            return Unit.f18162a;
        }
    }

    /* JADX INFO: renamed from: io.flutter.plugins.sharedpreferences.SharedPreferencesPlugin$setString$1, reason: invalid class name and case insensitive filesystem */
    @InterfaceC1611e(c = "io.flutter.plugins.sharedpreferences.SharedPreferencesPlugin$setString$1", f = "SharedPreferencesPlugin.kt", l = {87}, m = "invokeSuspend")
    public static final class C16341 extends AbstractC1616j implements Function2<E, InterfaceC1526a<? super Unit>, Object> {
        final /* synthetic */ String $key;
        final /* synthetic */ String $value;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C16341(String str, String str2, InterfaceC1526a<? super C16341> interfaceC1526a) {
            super(2, interfaceC1526a);
            this.$key = str;
            this.$value = str2;
        }

        @Override // ij.AbstractC1607a
        public final InterfaceC1526a<Unit> create(Object obj, InterfaceC1526a<?> interfaceC1526a) {
            return SharedPreferencesPlugin.this.new C16341(this.$key, this.$value, interfaceC1526a);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(E e, InterfaceC1526a<? super Unit> interfaceC1526a) {
            return ((C16341) create(e, interfaceC1526a)).invokeSuspend(Unit.f18162a);
        }

        @Override // ij.AbstractC1607a
        public final Object invokeSuspend(Object obj) {
            EnumC1578a enumC1578a = EnumC1578a.f17050a;
            int i = this.label;
            if (i == 0) {
                AbstractC1039j.b(obj);
                SharedPreferencesPlugin sharedPreferencesPlugin = SharedPreferencesPlugin.this;
                String str = this.$key;
                String str2 = this.$value;
                this.label = 1;
                if (sharedPreferencesPlugin.dataStoreSetString(str, str2, this) == enumC1578a) {
                    return enumC1578a;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC1039j.b(obj);
            }
            return Unit.f18162a;
        }
    }

    public SharedPreferencesPlugin() {
        this.listEncoder = new ListEncoder();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object dataStoreSetString(String str, String str2, InterfaceC1526a<? super Unit> interfaceC1526a) {
        Preferences.Key<String> keyStringKey = PreferencesKeys.stringKey(str);
        Context context = this.context;
        if (context != null) {
            Object objEdit = PreferencesKt.edit(SharedPreferencesPluginKt.getSharedPreferencesDataStore(context), new AnonymousClass2(keyStringKey, str2, null), interfaceC1526a);
            return objEdit == EnumC1578a.f17050a ? objEdit : Unit.f18162a;
        }
        j.n("context");
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00a3, code lost:
    
        if (r10 == r1) goto L32;
     */
    /* JADX WARN: Removed duplicated region for block: B:30:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00c0 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:31:0x00a3 -> B:33:0x00a6). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object getPrefs(java.util.List<java.lang.String> r9, gj.InterfaceC1526a<? super java.util.Map<java.lang.String, ? extends java.lang.Object>> r10) {
        /*
            r8 = this;
            boolean r0 = r10 instanceof io.flutter.plugins.sharedpreferences.SharedPreferencesPlugin.C16271
            if (r0 == 0) goto L13
            r0 = r10
            io.flutter.plugins.sharedpreferences.SharedPreferencesPlugin$getPrefs$1 r0 = (io.flutter.plugins.sharedpreferences.SharedPreferencesPlugin.C16271) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            io.flutter.plugins.sharedpreferences.SharedPreferencesPlugin$getPrefs$1 r0 = new io.flutter.plugins.sharedpreferences.SharedPreferencesPlugin$getPrefs$1
            r0.<init>(r10)
        L18:
            java.lang.Object r10 = r0.result
            hj.a r1 = hj.EnumC1578a.f17050a
            int r2 = r0.label
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L57
            if (r2 == r4) goto L47
            if (r2 != r3) goto L3f
            java.lang.Object r9 = r0.L$4
            androidx.datastore.preferences.core.Preferences$Key r9 = (androidx.datastore.preferences.core.Preferences.Key) r9
            java.lang.Object r2 = r0.L$3
            java.util.Iterator r2 = (java.util.Iterator) r2
            java.lang.Object r4 = r0.L$2
            java.util.Map r4 = (java.util.Map) r4
            java.lang.Object r5 = r0.L$1
            java.util.Set r5 = (java.util.Set) r5
            java.lang.Object r6 = r0.L$0
            io.flutter.plugins.sharedpreferences.SharedPreferencesPlugin r6 = (io.flutter.plugins.sharedpreferences.SharedPreferencesPlugin) r6
            bj.AbstractC1039j.b(r10)
            goto La6
        L3f:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L47:
            java.lang.Object r9 = r0.L$2
            java.util.Map r9 = (java.util.Map) r9
            java.lang.Object r2 = r0.L$1
            java.util.Set r2 = (java.util.Set) r2
            java.lang.Object r4 = r0.L$0
            io.flutter.plugins.sharedpreferences.SharedPreferencesPlugin r4 = (io.flutter.plugins.sharedpreferences.SharedPreferencesPlugin) r4
            bj.AbstractC1039j.b(r10)
            goto L7b
        L57:
            bj.AbstractC1039j.b(r10)
            if (r9 == 0) goto L64
            java.lang.Iterable r9 = (java.lang.Iterable) r9
            java.util.Set r9 = cj.C1110A.Z(r9)
        L62:
            r2 = r9
            goto L66
        L64:
            r9 = 0
            goto L62
        L66:
            java.util.LinkedHashMap r9 = new java.util.LinkedHashMap
            r9.<init>()
            r0.L$0 = r8
            r0.L$1 = r2
            r0.L$2 = r9
            r0.label = r4
            java.lang.Object r10 = r8.readAllKeys(r0)
            if (r10 != r1) goto L7a
            goto La5
        L7a:
            r4 = r8
        L7b:
            java.util.Set r10 = (java.util.Set) r10
            if (r10 == 0) goto Lc1
            java.util.Iterator r10 = r10.iterator()
            r5 = r2
            r6 = r4
            r4 = r9
            r2 = r10
        L87:
            boolean r9 = r2.hasNext()
            if (r9 == 0) goto Lc0
            java.lang.Object r9 = r2.next()
            androidx.datastore.preferences.core.Preferences$Key r9 = (androidx.datastore.preferences.core.Preferences.Key) r9
            r0.L$0 = r6
            r0.L$1 = r5
            r0.L$2 = r4
            r0.L$3 = r2
            r0.L$4 = r9
            r0.label = r3
            java.lang.Object r10 = r6.getValueByKey(r9, r0)
            if (r10 != r1) goto La6
        La5:
            return r1
        La6:
            java.lang.String r7 = r9.toString()
            boolean r7 = io.flutter.plugins.sharedpreferences.SharedPreferencesPluginKt.preferencesFilter(r7, r10, r5)
            if (r7 == 0) goto L87
            io.flutter.plugins.sharedpreferences.SharedPreferencesListEncoder r7 = r6.listEncoder
            java.lang.Object r10 = io.flutter.plugins.sharedpreferences.SharedPreferencesPluginKt.transformPref(r10, r7)
            if (r10 == 0) goto L87
            java.lang.String r9 = r9.toString()
            r4.put(r9, r10)
            goto L87
        Lc0:
            return r4
        Lc1:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: io.flutter.plugins.sharedpreferences.SharedPreferencesPlugin.getPrefs(java.util.List, gj.a):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object getValueByKey(final Preferences.Key<?> key, InterfaceC1526a<Object> interfaceC1526a) {
        Context context = this.context;
        if (context != null) {
            final InterfaceC0230h data = SharedPreferencesPluginKt.getSharedPreferencesDataStore(context).getData();
            return W.l(new InterfaceC0230h() { // from class: io.flutter.plugins.sharedpreferences.SharedPreferencesPlugin$getValueByKey$$inlined$map$1

                /* JADX INFO: renamed from: io.flutter.plugins.sharedpreferences.SharedPreferencesPlugin$getValueByKey$$inlined$map$1$2, reason: invalid class name */
                public static final class AnonymousClass2<T> implements InterfaceC0231i {
                    final /* synthetic */ Preferences.Key $key$inlined;
                    final /* synthetic */ InterfaceC0231i $this_unsafeFlow;

                    /* JADX INFO: renamed from: io.flutter.plugins.sharedpreferences.SharedPreferencesPlugin$getValueByKey$$inlined$map$1$2$1, reason: invalid class name */
                    @InterfaceC1611e(c = "io.flutter.plugins.sharedpreferences.SharedPreferencesPlugin$getValueByKey$$inlined$map$1$2", f = "SharedPreferencesPlugin.kt", l = {MfaTencentErrorResult.TENCENT_ERROR_PREPARE_TIME_OUT}, m = "emit")
                    public static final class AnonymousClass1 extends AbstractC1609c {
                        Object L$0;
                        int label;
                        /* synthetic */ Object result;

                        public AnonymousClass1(InterfaceC1526a interfaceC1526a) {
                            super(interfaceC1526a);
                        }

                        @Override // ij.AbstractC1607a
                        public final Object invokeSuspend(Object obj) {
                            this.result = obj;
                            this.label |= Integer.MIN_VALUE;
                            return AnonymousClass2.this.emit(null, this);
                        }
                    }

                    public AnonymousClass2(InterfaceC0231i interfaceC0231i, Preferences.Key key) {
                        this.$this_unsafeFlow = interfaceC0231i;
                        this.$key$inlined = key;
                    }

                    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
                    @Override // Ej.InterfaceC0231i
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                        To view partially-correct add '--show-bad-code' argument
                    */
                    public final java.lang.Object emit(java.lang.Object r5, gj.InterfaceC1526a r6) {
                        /*
                            r4 = this;
                            boolean r0 = r6 instanceof io.flutter.plugins.sharedpreferences.SharedPreferencesPlugin$getValueByKey$$inlined$map$1.AnonymousClass2.AnonymousClass1
                            if (r0 == 0) goto L13
                            r0 = r6
                            io.flutter.plugins.sharedpreferences.SharedPreferencesPlugin$getValueByKey$$inlined$map$1$2$1 r0 = (io.flutter.plugins.sharedpreferences.SharedPreferencesPlugin$getValueByKey$$inlined$map$1.AnonymousClass2.AnonymousClass1) r0
                            int r1 = r0.label
                            r2 = -2147483648(0xffffffff80000000, float:-0.0)
                            r3 = r1 & r2
                            if (r3 == 0) goto L13
                            int r1 = r1 - r2
                            r0.label = r1
                            goto L18
                        L13:
                            io.flutter.plugins.sharedpreferences.SharedPreferencesPlugin$getValueByKey$$inlined$map$1$2$1 r0 = new io.flutter.plugins.sharedpreferences.SharedPreferencesPlugin$getValueByKey$$inlined$map$1$2$1
                            r0.<init>(r6)
                        L18:
                            java.lang.Object r6 = r0.result
                            hj.a r1 = hj.EnumC1578a.f17050a
                            int r2 = r0.label
                            r3 = 1
                            if (r2 == 0) goto L2f
                            if (r2 != r3) goto L27
                            bj.AbstractC1039j.b(r6)
                            goto L45
                        L27:
                            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                            r5.<init>(r6)
                            throw r5
                        L2f:
                            bj.AbstractC1039j.b(r6)
                            Ej.i r6 = r4.$this_unsafeFlow
                            androidx.datastore.preferences.core.Preferences r5 = (androidx.datastore.preferences.core.Preferences) r5
                            androidx.datastore.preferences.core.Preferences$Key r2 = r4.$key$inlined
                            java.lang.Object r5 = r5.get(r2)
                            r0.label = r3
                            java.lang.Object r5 = r6.emit(r5, r0)
                            if (r5 != r1) goto L45
                            return r1
                        L45:
                            kotlin.Unit r5 = kotlin.Unit.f18162a
                            return r5
                        */
                        throw new UnsupportedOperationException("Method not decompiled: io.flutter.plugins.sharedpreferences.SharedPreferencesPlugin$getValueByKey$$inlined$map$1.AnonymousClass2.emit(java.lang.Object, gj.a):java.lang.Object");
                    }
                }

                @Override // Ej.InterfaceC0230h
                public Object collect(InterfaceC0231i interfaceC0231i, InterfaceC1526a interfaceC1526a2) {
                    Object objCollect = data.collect(new AnonymousClass2(interfaceC0231i, key), interfaceC1526a2);
                    return objCollect == EnumC1578a.f17050a ? objCollect : Unit.f18162a;
                }
            }, interfaceC1526a);
        }
        j.n("context");
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object readAllKeys(InterfaceC1526a<? super Set<? extends Preferences.Key<?>>> interfaceC1526a) {
        Context context = this.context;
        if (context != null) {
            final InterfaceC0230h data = SharedPreferencesPluginKt.getSharedPreferencesDataStore(context).getData();
            return W.l(new InterfaceC0230h() { // from class: io.flutter.plugins.sharedpreferences.SharedPreferencesPlugin$readAllKeys$$inlined$map$1

                /* JADX INFO: renamed from: io.flutter.plugins.sharedpreferences.SharedPreferencesPlugin$readAllKeys$$inlined$map$1$2, reason: invalid class name */
                public static final class AnonymousClass2<T> implements InterfaceC0231i {
                    final /* synthetic */ InterfaceC0231i $this_unsafeFlow;

                    /* JADX INFO: renamed from: io.flutter.plugins.sharedpreferences.SharedPreferencesPlugin$readAllKeys$$inlined$map$1$2$1, reason: invalid class name */
                    @InterfaceC1611e(c = "io.flutter.plugins.sharedpreferences.SharedPreferencesPlugin$readAllKeys$$inlined$map$1$2", f = "SharedPreferencesPlugin.kt", l = {MfaTencentErrorResult.TENCENT_ERROR_PREPARE_TIME_OUT}, m = "emit")
                    public static final class AnonymousClass1 extends AbstractC1609c {
                        Object L$0;
                        int label;
                        /* synthetic */ Object result;

                        public AnonymousClass1(InterfaceC1526a interfaceC1526a) {
                            super(interfaceC1526a);
                        }

                        @Override // ij.AbstractC1607a
                        public final Object invokeSuspend(Object obj) {
                            this.result = obj;
                            this.label |= Integer.MIN_VALUE;
                            return AnonymousClass2.this.emit(null, this);
                        }
                    }

                    public AnonymousClass2(InterfaceC0231i interfaceC0231i) {
                        this.$this_unsafeFlow = interfaceC0231i;
                    }

                    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
                    @Override // Ej.InterfaceC0231i
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                        To view partially-correct add '--show-bad-code' argument
                    */
                    public final java.lang.Object emit(java.lang.Object r5, gj.InterfaceC1526a r6) {
                        /*
                            r4 = this;
                            boolean r0 = r6 instanceof io.flutter.plugins.sharedpreferences.SharedPreferencesPlugin$readAllKeys$$inlined$map$1.AnonymousClass2.AnonymousClass1
                            if (r0 == 0) goto L13
                            r0 = r6
                            io.flutter.plugins.sharedpreferences.SharedPreferencesPlugin$readAllKeys$$inlined$map$1$2$1 r0 = (io.flutter.plugins.sharedpreferences.SharedPreferencesPlugin$readAllKeys$$inlined$map$1.AnonymousClass2.AnonymousClass1) r0
                            int r1 = r0.label
                            r2 = -2147483648(0xffffffff80000000, float:-0.0)
                            r3 = r1 & r2
                            if (r3 == 0) goto L13
                            int r1 = r1 - r2
                            r0.label = r1
                            goto L18
                        L13:
                            io.flutter.plugins.sharedpreferences.SharedPreferencesPlugin$readAllKeys$$inlined$map$1$2$1 r0 = new io.flutter.plugins.sharedpreferences.SharedPreferencesPlugin$readAllKeys$$inlined$map$1$2$1
                            r0.<init>(r6)
                        L18:
                            java.lang.Object r6 = r0.result
                            hj.a r1 = hj.EnumC1578a.f17050a
                            int r2 = r0.label
                            r3 = 1
                            if (r2 == 0) goto L2f
                            if (r2 != r3) goto L27
                            bj.AbstractC1039j.b(r6)
                            goto L47
                        L27:
                            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                            r5.<init>(r6)
                            throw r5
                        L2f:
                            bj.AbstractC1039j.b(r6)
                            Ej.i r6 = r4.$this_unsafeFlow
                            androidx.datastore.preferences.core.Preferences r5 = (androidx.datastore.preferences.core.Preferences) r5
                            java.util.Map r5 = r5.asMap()
                            java.util.Set r5 = r5.keySet()
                            r0.label = r3
                            java.lang.Object r5 = r6.emit(r5, r0)
                            if (r5 != r1) goto L47
                            return r1
                        L47:
                            kotlin.Unit r5 = kotlin.Unit.f18162a
                            return r5
                        */
                        throw new UnsupportedOperationException("Method not decompiled: io.flutter.plugins.sharedpreferences.SharedPreferencesPlugin$readAllKeys$$inlined$map$1.AnonymousClass2.emit(java.lang.Object, gj.a):java.lang.Object");
                    }
                }

                @Override // Ej.InterfaceC0230h
                public Object collect(InterfaceC0231i interfaceC0231i, InterfaceC1526a interfaceC1526a2) {
                    Object objCollect = data.collect(new AnonymousClass2(interfaceC0231i), interfaceC1526a2);
                    return objCollect == EnumC1578a.f17050a ? objCollect : Unit.f18162a;
                }
            }, interfaceC1526a);
        }
        j.n("context");
        throw null;
    }

    private final void setUp(pg.j jVar, Context context) {
        this.context = context;
        try {
            SharedPreferencesAsyncApi.Companion.setUp(jVar, this, "data_store");
            this.backend = new SharedPreferencesBackend(jVar, context, this.listEncoder);
        } catch (Exception e) {
            Log.e(SharedPreferencesPluginKt.TAG, "Received exception while setting up SharedPreferencesPlugin", e);
        }
    }

    @Override // io.flutter.plugins.sharedpreferences.SharedPreferencesAsyncApi
    public void clear(List<String> list, SharedPreferencesPigeonOptions options) throws Throwable {
        j.g(options, "options");
        H.x(g.f18170a, new AnonymousClass1(list, null));
    }

    @Override // io.flutter.plugins.sharedpreferences.SharedPreferencesAsyncApi
    public Map<String, Object> getAll(List<String> list, SharedPreferencesPigeonOptions options) {
        j.g(options, "options");
        return (Map) H.x(g.f18170a, new C16231(list, null));
    }

    @Override // io.flutter.plugins.sharedpreferences.SharedPreferencesAsyncApi
    public Boolean getBool(String key, SharedPreferencesPigeonOptions options) throws Throwable {
        j.g(key, "key");
        j.g(options, "options");
        y yVar = new y();
        H.x(g.f18170a, new C16241(key, this, yVar, null));
        return (Boolean) yVar.f18195a;
    }

    @Override // io.flutter.plugins.sharedpreferences.SharedPreferencesAsyncApi
    public Double getDouble(String key, SharedPreferencesPigeonOptions options) throws Throwable {
        j.g(key, "key");
        j.g(options, "options");
        y yVar = new y();
        H.x(g.f18170a, new C16251(key, this, yVar, null));
        return (Double) yVar.f18195a;
    }

    @Override // io.flutter.plugins.sharedpreferences.SharedPreferencesAsyncApi
    public Long getInt(String key, SharedPreferencesPigeonOptions options) throws Throwable {
        j.g(key, "key");
        j.g(options, "options");
        y yVar = new y();
        H.x(g.f18170a, new C16261(key, this, yVar, null));
        return (Long) yVar.f18195a;
    }

    @Override // io.flutter.plugins.sharedpreferences.SharedPreferencesAsyncApi
    public List<String> getKeys(List<String> list, SharedPreferencesPigeonOptions options) {
        j.g(options, "options");
        return C1110A.V(((Map) H.x(g.f18170a, new SharedPreferencesPlugin$getKeys$prefs$1(this, list, null))).keySet());
    }

    @Override // io.flutter.plugins.sharedpreferences.SharedPreferencesAsyncApi
    public List<String> getPlatformEncodedStringList(String key, SharedPreferencesPigeonOptions options) throws Throwable {
        List list;
        j.g(key, "key");
        j.g(options, "options");
        String string = getString(key, options);
        if (string == null || z.w(string, 2, SharedPreferencesPluginKt.JSON_LIST_PREFIX, false) || !z.w(string, 2, SharedPreferencesPluginKt.LIST_PREFIX, false) || (list = (List) SharedPreferencesPluginKt.transformPref(string, this.listEncoder)) == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (obj instanceof String) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    @Override // io.flutter.plugins.sharedpreferences.SharedPreferencesAsyncApi
    public String getString(String key, SharedPreferencesPigeonOptions options) throws Throwable {
        j.g(key, "key");
        j.g(options, "options");
        y yVar = new y();
        H.x(g.f18170a, new C16281(key, this, yVar, null));
        return (String) yVar.f18195a;
    }

    @Override // io.flutter.plugins.sharedpreferences.SharedPreferencesAsyncApi
    public StringListResult getStringList(String key, SharedPreferencesPigeonOptions options) throws Throwable {
        j.g(key, "key");
        j.g(options, "options");
        String string = getString(key, options);
        if (string != null) {
            return z.w(string, 2, SharedPreferencesPluginKt.JSON_LIST_PREFIX, false) ? new StringListResult(string, StringListLookupResultType.JSON_ENCODED) : z.w(string, 2, SharedPreferencesPluginKt.LIST_PREFIX, false) ? new StringListResult(null, StringListLookupResultType.PLATFORM_ENCODED) : new StringListResult(null, StringListLookupResultType.UNEXPECTED_STRING);
        }
        return null;
    }

    @Override // io.flutter.embedding.engine.plugins.FlutterPlugin
    public void onAttachedToEngine(FlutterPlugin.FlutterPluginBinding binding) {
        j.g(binding, "binding");
        pg.j binaryMessenger = binding.getBinaryMessenger();
        j.f(binaryMessenger, "getBinaryMessenger(...)");
        Context applicationContext = binding.getApplicationContext();
        j.f(applicationContext, "getApplicationContext(...)");
        setUp(binaryMessenger, applicationContext);
        new LegacySharedPreferencesPlugin().onAttachedToEngine(binding);
    }

    @Override // io.flutter.embedding.engine.plugins.FlutterPlugin
    public void onDetachedFromEngine(FlutterPlugin.FlutterPluginBinding binding) {
        j.g(binding, "binding");
        SharedPreferencesAsyncApi.Companion companion = SharedPreferencesAsyncApi.Companion;
        pg.j binaryMessenger = binding.getBinaryMessenger();
        j.f(binaryMessenger, "getBinaryMessenger(...)");
        companion.setUp(binaryMessenger, null, "data_store");
        SharedPreferencesBackend sharedPreferencesBackend = this.backend;
        if (sharedPreferencesBackend != null) {
            sharedPreferencesBackend.tearDown();
        }
        this.backend = null;
    }

    @Override // io.flutter.plugins.sharedpreferences.SharedPreferencesAsyncApi
    public void setBool(String key, boolean z4, SharedPreferencesPigeonOptions options) throws Throwable {
        j.g(key, "key");
        j.g(options, "options");
        H.x(g.f18170a, new C16291(key, this, z4, null));
    }

    @Override // io.flutter.plugins.sharedpreferences.SharedPreferencesAsyncApi
    public void setDeprecatedStringList(String key, List<String> value, SharedPreferencesPigeonOptions options) throws Throwable {
        j.g(key, "key");
        j.g(value, "value");
        j.g(options, "options");
        H.x(g.f18170a, new C16301(key, AbstractC1414e.h(SharedPreferencesPluginKt.LIST_PREFIX, this.listEncoder.encode(value)), null));
    }

    @Override // io.flutter.plugins.sharedpreferences.SharedPreferencesAsyncApi
    public void setDouble(String key, double d10, SharedPreferencesPigeonOptions options) throws Throwable {
        j.g(key, "key");
        j.g(options, "options");
        H.x(g.f18170a, new C16311(key, this, d10, null));
    }

    @Override // io.flutter.plugins.sharedpreferences.SharedPreferencesAsyncApi
    public void setEncodedStringList(String key, String value, SharedPreferencesPigeonOptions options) throws Throwable {
        j.g(key, "key");
        j.g(value, "value");
        j.g(options, "options");
        H.x(g.f18170a, new C16321(key, value, null));
    }

    @Override // io.flutter.plugins.sharedpreferences.SharedPreferencesAsyncApi
    public void setInt(String key, long j, SharedPreferencesPigeonOptions options) throws Throwable {
        j.g(key, "key");
        j.g(options, "options");
        H.x(g.f18170a, new C16331(key, this, j, null));
    }

    @Override // io.flutter.plugins.sharedpreferences.SharedPreferencesAsyncApi
    public void setString(String key, String value, SharedPreferencesPigeonOptions options) throws Throwable {
        j.g(key, "key");
        j.g(value, "value");
        j.g(options, "options");
        H.x(g.f18170a, new C16341(key, value, null));
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @VisibleForTesting
    public SharedPreferencesPlugin(SharedPreferencesListEncoder listEncoder) {
        this();
        j.g(listEncoder, "listEncoder");
        this.listEncoder = listEncoder;
    }
}
