package androidx.room;

import androidx.sqlite.db.SupportSQLiteStatement;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.k;

/* JADX INFO: loaded from: classes2.dex */
public final class SharedSQLiteStatement$stmt$2 extends k implements Function0<SupportSQLiteStatement> {
    final /* synthetic */ SharedSQLiteStatement this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SharedSQLiteStatement$stmt$2(SharedSQLiteStatement sharedSQLiteStatement) {
        super(0);
        this.this$0 = sharedSQLiteStatement;
    }

    @Override // kotlin.jvm.functions.Function0
    public final SupportSQLiteStatement invoke() {
        return this.this$0.createNewStatement();
    }
}
