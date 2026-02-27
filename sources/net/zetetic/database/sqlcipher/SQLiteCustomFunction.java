package net.zetetic.database.sqlcipher;

import net.zetetic.database.sqlcipher.SQLiteDatabase;

/* JADX INFO: loaded from: classes2.dex */
public final class SQLiteCustomFunction {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SQLiteDatabase.CustomFunction f18684a;
    public final String name;
    public final int numArgs;

    public SQLiteCustomFunction(String str, int i, SQLiteDatabase.CustomFunction customFunction) {
        if (str == null) {
            throw new IllegalArgumentException("name must not be null.");
        }
        this.name = str;
        this.numArgs = i;
        this.f18684a = customFunction;
    }

    private void dispatchCallback(String[] strArr) {
        this.f18684a.callback();
    }
}
