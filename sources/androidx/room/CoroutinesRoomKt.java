package androidx.room;

import Bj.A;
import Bj.H;
import androidx.annotation.RestrictTo;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class CoroutinesRoomKt {
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public static final A getQueryDispatcher(RoomDatabase roomDatabase) {
        Map<String, Object> backingFieldMap = roomDatabase.getBackingFieldMap();
        Object objN = backingFieldMap.get("QueryDispatcher");
        if (objN == null) {
            objN = H.n(roomDatabase.getQueryExecutor());
            backingFieldMap.put("QueryDispatcher", objN);
        }
        return (A) objN;
    }

    public static final A getTransactionDispatcher(RoomDatabase roomDatabase) {
        Map<String, Object> backingFieldMap = roomDatabase.getBackingFieldMap();
        Object objN = backingFieldMap.get("TransactionDispatcher");
        if (objN == null) {
            objN = H.n(roomDatabase.getTransactionExecutor());
            backingFieldMap.put("TransactionDispatcher", objN);
        }
        return (A) objN;
    }
}
