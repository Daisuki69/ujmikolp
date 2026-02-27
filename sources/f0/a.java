package F0;

import B5.g;
import G0.b;
import G0.c;
import G0.d;
import android.content.Context;
import android.os.Build;
import io.flutter.embedding.engine.plugins.FlutterPlugin;
import kotlin.jvm.internal.j;
import pg.r;
import pg.s;
import pg.t;
import pg.u;

/* JADX INFO: loaded from: classes2.dex */
public final class a implements FlutterPlugin, s {
    public static boolean c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Context f1515a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public u f1516b;

    @Override // io.flutter.embedding.engine.plugins.FlutterPlugin
    public final void onAttachedToEngine(FlutterPlugin.FlutterPluginBinding binding) {
        j.g(binding, "binding");
        this.f1515a = binding.getApplicationContext();
        u uVar = new u(binding.getBinaryMessenger(), "flutter_image_compress");
        this.f1516b = uVar;
        uVar.b(this);
    }

    @Override // io.flutter.embedding.engine.plugins.FlutterPlugin
    public final void onDetachedFromEngine(FlutterPlugin.FlutterPluginBinding binding) {
        j.g(binding, "binding");
        u uVar = this.f1516b;
        if (uVar != null) {
            uVar.b(null);
        }
        this.f1516b = null;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // pg.s
    public final void onMethodCall(r call, t result) {
        j.g(call, "call");
        j.g(result, "result");
        String str = call.f19112a;
        if (str != null) {
            switch (str.hashCode()) {
                case -129880033:
                    if (str.equals("compressWithFileAndGetFile")) {
                        final b bVar = new b(call, result);
                        final Context context = this.f1515a;
                        if (context == null) {
                            j.n("context");
                            throw null;
                        }
                        final int i = 1;
                        d.f1694d.execute(new Runnable() { // from class: G0.a
                            /* JADX WARN: Multi-variable type inference failed */
                            /* JADX WARN: Removed duplicated region for block: B:39:0x0123  */
                            /* JADX WARN: Type inference failed for: r0v9, types: [byte[], java.io.Serializable] */
                            /* JADX WARN: Type inference fix 'apply assigned field type' failed
                            java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
                            	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
                            	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
                            	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
                            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
                            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
                            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
                            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
                             */
                            @Override // java.lang.Runnable
                            /*
                                Code decompiled incorrectly, please refer to instructions dump.
                                To view partially-correct add '--show-bad-code' argument
                            */
                            public final void run() throws java.lang.Throwable {
                                /*
                                    Method dump skipped, instruction units count: 562
                                    To view this dump add '--comments-level debug' option
                                */
                                throw new UnsupportedOperationException("Method not decompiled: G0.a.run():void");
                            }
                        });
                        return;
                    }
                    break;
                case 86054116:
                    if (str.equals("compressWithFile")) {
                        final b bVar2 = new b(call, result);
                        final Context context2 = this.f1515a;
                        if (context2 == null) {
                            j.n("context");
                            throw null;
                        }
                        final int i4 = 0;
                        d.f1694d.execute(new Runnable() { // from class: G0.a
                            /* JADX WARN: Multi-variable type inference failed */
                            /* JADX WARN: Removed duplicated region for block: B:39:0x0123  */
                            /* JADX WARN: Type inference failed for: r0v9, types: [byte[], java.io.Serializable] */
                            /* JADX WARN: Type inference fix 'apply assigned field type' failed
                            java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
                            	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
                            	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
                            	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
                            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
                            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
                            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
                            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
                             */
                            @Override // java.lang.Runnable
                            /*
                                Code decompiled incorrectly, please refer to instructions dump.
                                To view partially-correct add '--show-bad-code' argument
                            */
                            public final void run() throws java.lang.Throwable {
                                /*
                                    Method dump skipped, instruction units count: 562
                                    To view this dump add '--comments-level debug' option
                                */
                                throw new UnsupportedOperationException("Method not decompiled: G0.a.run():void");
                            }
                        });
                        return;
                    }
                    break;
                case 86233094:
                    if (str.equals("compressWithList")) {
                        c cVar = new c(call, result);
                        Context context3 = this.f1515a;
                        if (context3 == null) {
                            j.n("context");
                            throw null;
                        }
                        d.f1694d.execute(new g(1, cVar, context3));
                        return;
                    }
                    break;
                case 1262746611:
                    if (str.equals("getSystemVersion")) {
                        result.success(Integer.valueOf(Build.VERSION.SDK_INT));
                        return;
                    }
                    break;
                case 2067272455:
                    if (str.equals("showLog")) {
                        c = j.b((Boolean) call.f19113b, Boolean.TRUE);
                        result.success(1);
                        return;
                    }
                    break;
            }
        }
        result.notImplemented();
    }
}
