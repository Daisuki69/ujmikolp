package androidx.datastore.core;

import gj.InterfaceC1526a;
import ij.AbstractC1616j;
import ij.InterfaceC1611e;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
@InterfaceC1611e(c = "androidx.datastore.core.DataMigrationInitializer$Companion$runMigrations$2$1$1", f = "DataMigrationInitializer.kt", l = {45}, m = "invokeSuspend")
public final class DataMigrationInitializer$Companion$runMigrations$2$1$1 extends AbstractC1616j implements Function1<InterfaceC1526a<? super Unit>, Object> {
    final /* synthetic */ DataMigration<T> $migration;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DataMigrationInitializer$Companion$runMigrations$2$1$1(DataMigration<T> dataMigration, InterfaceC1526a<? super DataMigrationInitializer$Companion$runMigrations$2$1$1> interfaceC1526a) {
        super(1, interfaceC1526a);
        this.$migration = dataMigration;
    }

    @Override // ij.AbstractC1607a
    public final InterfaceC1526a<Unit> create(InterfaceC1526a<?> interfaceC1526a) {
        return new DataMigrationInitializer$Companion$runMigrations$2$1$1(this.$migration, interfaceC1526a);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(InterfaceC1526a<? super Unit> interfaceC1526a) {
        return ((DataMigrationInitializer$Companion$runMigrations$2$1$1) create(interfaceC1526a)).invokeSuspend(Unit.f18162a);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't change immutable type gj.a to androidx.datastore.core.DataMigrationInitializer$Companion$runMigrations$2$1$1 for r3v1 'this'  gj.a
        	at jadx.core.dex.instructions.args.SSAVar.setType(SSAVar.java:114)
        	at jadx.core.dex.instructions.args.RegisterArg.setType(RegisterArg.java:52)
        	at jadx.core.dex.visitors.ModVisitor.removeCheckCast(ModVisitor.java:417)
        	at jadx.core.dex.visitors.ModVisitor.replaceStep(ModVisitor.java:152)
        	at jadx.core.dex.visitors.ModVisitor.visit(ModVisitor.java:96)
        */
    @Override // ij.AbstractC1607a
    public final java.lang.Object invokeSuspend(java.lang.Object r4) {
        /*
            r3 = this;
            hj.a r0 = hj.EnumC1578a.f17050a
            int r1 = r3.label
            r2 = 1
            if (r1 == 0) goto L15
            if (r1 != r2) goto Ld
            bj.AbstractC1039j.b(r4)
            goto L23
        Ld:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r0)
            throw r4
        L15:
            bj.AbstractC1039j.b(r4)
            androidx.datastore.core.DataMigration<T> r4 = r3.$migration
            r3.label = r2
            java.lang.Object r4 = r4.cleanUp(r3)
            if (r4 != r0) goto L23
            return r0
        L23:
            kotlin.Unit r4 = kotlin.Unit.f18162a
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.core.DataMigrationInitializer$Companion$runMigrations$2$1$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
