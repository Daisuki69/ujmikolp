package androidx.room.util;

import We.s;
import androidx.annotation.RestrictTo;
import androidx.annotation.VisibleForTesting;
import androidx.room.ColumnInfo;
import androidx.room.Index;
import androidx.sqlite.db.SupportSQLiteDatabase;
import cj.C1114E;
import com.google.android.gms.ads.AdError;
import defpackage.AbstractC1414e;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.j;
import zj.C2576A;
import zj.z;

/* JADX INFO: loaded from: classes2.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
public final class TableInfo {
    public static final int CREATED_FROM_DATABASE = 2;
    public static final int CREATED_FROM_ENTITY = 1;
    public static final int CREATED_FROM_UNKNOWN = 0;
    public static final Companion Companion = new Companion(null);
    public final Map<String, Column> columns;
    public final Set<ForeignKey> foreignKeys;
    public final Set<Index> indices;
    public final String name;

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final TableInfo read(SupportSQLiteDatabase database, String tableName) {
            j.g(database, "database");
            j.g(tableName, "tableName");
            return TableInfoKt.readTableInfo(database, tableName);
        }

        private Companion() {
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface CreatedFrom {
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public static final class ForeignKey {
        public final List<String> columnNames;
        public final String onDelete;
        public final String onUpdate;
        public final List<String> referenceColumnNames;
        public final String referenceTable;

        public ForeignKey(String referenceTable, String onDelete, String onUpdate, List<String> columnNames, List<String> referenceColumnNames) {
            j.g(referenceTable, "referenceTable");
            j.g(onDelete, "onDelete");
            j.g(onUpdate, "onUpdate");
            j.g(columnNames, "columnNames");
            j.g(referenceColumnNames, "referenceColumnNames");
            this.referenceTable = referenceTable;
            this.onDelete = onDelete;
            this.onUpdate = onUpdate;
            this.columnNames = columnNames;
            this.referenceColumnNames = referenceColumnNames;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ForeignKey)) {
                return false;
            }
            ForeignKey foreignKey = (ForeignKey) obj;
            if (j.b(this.referenceTable, foreignKey.referenceTable) && j.b(this.onDelete, foreignKey.onDelete) && j.b(this.onUpdate, foreignKey.onUpdate) && j.b(this.columnNames, foreignKey.columnNames)) {
                return j.b(this.referenceColumnNames, foreignKey.referenceColumnNames);
            }
            return false;
        }

        public int hashCode() {
            return this.referenceColumnNames.hashCode() + AbstractC1414e.d(this.columnNames, AbstractC1414e.c(AbstractC1414e.c(this.referenceTable.hashCode() * 31, 31, this.onDelete), 31, this.onUpdate), 31);
        }

        public String toString() {
            return "ForeignKey{referenceTable='" + this.referenceTable + "', onDelete='" + this.onDelete + " +', onUpdate='" + this.onUpdate + "', columnNames=" + this.columnNames + ", referenceColumnNames=" + this.referenceColumnNames + '}';
        }
    }

    public static final class ForeignKeyWithSequence implements Comparable<ForeignKeyWithSequence> {
        private final String from;
        private final int id;
        private final int sequence;
        private final String to;

        public ForeignKeyWithSequence(int i, int i4, String from, String to) {
            j.g(from, "from");
            j.g(to, "to");
            this.id = i;
            this.sequence = i4;
            this.from = from;
            this.to = to;
        }

        public final String getFrom() {
            return this.from;
        }

        public final int getId() {
            return this.id;
        }

        public final int getSequence() {
            return this.sequence;
        }

        public final String getTo() {
            return this.to;
        }

        @Override // java.lang.Comparable
        public int compareTo(ForeignKeyWithSequence other) {
            j.g(other, "other");
            int i = this.id - other.id;
            return i == 0 ? this.sequence - other.sequence : i;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public TableInfo(String name, Map<String, Column> columns, Set<ForeignKey> foreignKeys) {
        this(name, columns, foreignKeys, C1114E.f9379a);
        j.g(name, "name");
        j.g(columns, "columns");
        j.g(foreignKeys, "foreignKeys");
    }

    public static final TableInfo read(SupportSQLiteDatabase supportSQLiteDatabase, String str) {
        return Companion.read(supportSQLiteDatabase, str);
    }

    public boolean equals(Object obj) {
        Set<Index> set;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TableInfo)) {
            return false;
        }
        TableInfo tableInfo = (TableInfo) obj;
        if (!j.b(this.name, tableInfo.name) || !j.b(this.columns, tableInfo.columns) || !j.b(this.foreignKeys, tableInfo.foreignKeys)) {
            return false;
        }
        Set<Index> set2 = this.indices;
        if (set2 == null || (set = tableInfo.indices) == null) {
            return true;
        }
        return j.b(set2, set);
    }

    public int hashCode() {
        return this.foreignKeys.hashCode() + ((this.columns.hashCode() + (this.name.hashCode() * 31)) * 31);
    }

    public String toString() {
        return "TableInfo{name='" + this.name + "', columns=" + this.columns + ", foreignKeys=" + this.foreignKeys + ", indices=" + this.indices + '}';
    }

    public TableInfo(String name, Map<String, Column> columns, Set<ForeignKey> foreignKeys, Set<Index> set) {
        j.g(name, "name");
        j.g(columns, "columns");
        j.g(foreignKeys, "foreignKeys");
        this.name = name;
        this.columns = columns;
        this.foreignKeys = foreignKeys;
        this.indices = set;
    }

    public static final class Column {
        public static final Companion Companion = new Companion(null);
        public final int affinity;
        public final int createdFrom;
        public final String defaultValue;
        public final String name;
        public final boolean notNull;
        public final int primaryKeyPosition;
        public final String type;

        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private final boolean containsSurroundingParenthesis(String str) {
                if (str.length() == 0) {
                    return false;
                }
                int i = 0;
                int i4 = 0;
                int i6 = 0;
                while (i < str.length()) {
                    char cCharAt = str.charAt(i);
                    int i10 = i6 + 1;
                    if (i6 == 0 && cCharAt != '(') {
                        return false;
                    }
                    if (cCharAt == '(') {
                        i4++;
                    } else if (cCharAt == ')' && i4 - 1 == 0 && i6 != str.length() - 1) {
                        return false;
                    }
                    i++;
                    i6 = i10;
                }
                return i4 == 0;
            }

            @VisibleForTesting
            public final boolean defaultValueEquals(String current, String str) {
                j.g(current, "current");
                if (current.equals(str)) {
                    return true;
                }
                if (!containsSurroundingParenthesis(current)) {
                    return false;
                }
                String strSubstring = current.substring(1, current.length() - 1);
                j.f(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
                return j.b(C2576A.b0(strSubstring).toString(), str);
            }

            private Companion() {
            }
        }

        public Column(String name, String type, boolean z4, int i, String str, int i4) {
            j.g(name, "name");
            j.g(type, "type");
            this.name = name;
            this.type = type;
            this.notNull = z4;
            this.primaryKeyPosition = i;
            this.defaultValue = str;
            this.createdFrom = i4;
            this.affinity = findAffinity(type);
        }

        @VisibleForTesting
        public static final boolean defaultValueEquals(String str, String str2) {
            return Companion.defaultValueEquals(str, str2);
        }

        @ColumnInfo.SQLiteTypeAffinity
        private final int findAffinity(String str) {
            if (str == null) {
                return 5;
            }
            Locale US = Locale.US;
            j.f(US, "US");
            String upperCase = str.toUpperCase(US);
            j.f(upperCase, "this as java.lang.String).toUpperCase(locale)");
            if (C2576A.z(upperCase, "INT", false, 2)) {
                return 3;
            }
            if (C2576A.z(upperCase, "CHAR", false, 2) || C2576A.z(upperCase, "CLOB", false, 2) || C2576A.z(upperCase, "TEXT", false, 2)) {
                return 2;
            }
            if (C2576A.z(upperCase, "BLOB", false, 2)) {
                return 5;
            }
            return (C2576A.z(upperCase, "REAL", false, 2) || C2576A.z(upperCase, "FLOA", false, 2) || C2576A.z(upperCase, "DOUB", false, 2)) ? 4 : 1;
        }

        @ColumnInfo.SQLiteTypeAffinity
        public static /* synthetic */ void getAffinity$annotations() {
        }

        public boolean equals(Object obj) {
            String str;
            String str2;
            String str3;
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Column) || this.primaryKeyPosition != ((Column) obj).primaryKeyPosition) {
                return false;
            }
            Column column = (Column) obj;
            if (!j.b(this.name, column.name) || this.notNull != column.notNull) {
                return false;
            }
            if (this.createdFrom == 1 && column.createdFrom == 2 && (str3 = this.defaultValue) != null && !Companion.defaultValueEquals(str3, column.defaultValue)) {
                return false;
            }
            if (this.createdFrom == 2 && column.createdFrom == 1 && (str2 = column.defaultValue) != null && !Companion.defaultValueEquals(str2, this.defaultValue)) {
                return false;
            }
            int i = this.createdFrom;
            return (i == 0 || i != column.createdFrom || ((str = this.defaultValue) == null ? column.defaultValue == null : Companion.defaultValueEquals(str, column.defaultValue))) && this.affinity == column.affinity;
        }

        public int hashCode() {
            return (((((this.name.hashCode() * 31) + this.affinity) * 31) + (this.notNull ? 1231 : 1237)) * 31) + this.primaryKeyPosition;
        }

        public final boolean isPrimaryKey() {
            return this.primaryKeyPosition > 0;
        }

        public String toString() {
            StringBuilder sb2 = new StringBuilder("Column{name='");
            sb2.append(this.name);
            sb2.append("', type='");
            sb2.append(this.type);
            sb2.append("', affinity='");
            sb2.append(this.affinity);
            sb2.append("', notNull=");
            sb2.append(this.notNull);
            sb2.append(", primaryKeyPosition=");
            sb2.append(this.primaryKeyPosition);
            sb2.append(", defaultValue='");
            String str = this.defaultValue;
            if (str == null) {
                str = AdError.UNDEFINED_DOMAIN;
            }
            return s.p(sb2, str, "'}");
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public Column(String name, String type, boolean z4, int i) {
            this(name, type, z4, i, null, 0);
            j.g(name, "name");
            j.g(type, "type");
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public static final class Index {
        public static final Companion Companion = new Companion(null);
        public static final String DEFAULT_PREFIX = "index_";
        public final List<String> columns;
        public final String name;
        public List<String> orders;
        public final boolean unique;

        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r5v1, types: [java.util.Collection] */
        /* JADX WARN: Type inference failed for: r5v2 */
        /* JADX WARN: Type inference failed for: r5v4, types: [java.util.ArrayList] */
        public Index(String name, boolean z4, List<String> columns, List<String> orders) {
            j.g(name, "name");
            j.g(columns, "columns");
            j.g(orders, "orders");
            this.name = name;
            this.unique = z4;
            this.columns = columns;
            this.orders = orders;
            List<String> arrayList = orders;
            if (arrayList.isEmpty()) {
                int size = columns.size();
                arrayList = new ArrayList(size);
                for (int i = 0; i < size; i++) {
                    arrayList.add(Index.Order.ASC.name());
                }
            }
            this.orders = (List) arrayList;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof Index) {
                Index index = (Index) obj;
                if (this.unique == index.unique && j.b(this.columns, index.columns) && j.b(this.orders, index.orders)) {
                    return z.w(this.name, 2, DEFAULT_PREFIX, false) ? z.w(index.name, 2, DEFAULT_PREFIX, false) : j.b(this.name, index.name);
                }
            }
            return false;
        }

        public int hashCode() {
            return this.orders.hashCode() + AbstractC1414e.d(this.columns, (((z.w(this.name, 2, DEFAULT_PREFIX, false) ? -1184239155 : this.name.hashCode()) * 31) + (this.unique ? 1 : 0)) * 31, 31);
        }

        public String toString() {
            StringBuilder sb2 = new StringBuilder("Index{name='");
            sb2.append(this.name);
            sb2.append("', unique=");
            sb2.append(this.unique);
            sb2.append(", columns=");
            sb2.append(this.columns);
            sb2.append(", orders=");
            return s.r(sb2, this.orders, "'}");
        }

        public Index(String name, boolean z4, List<String> columns) {
            j.g(name, "name");
            j.g(columns, "columns");
            int size = columns.size();
            ArrayList arrayList = new ArrayList(size);
            for (int i = 0; i < size; i++) {
                arrayList.add(Index.Order.ASC.name());
            }
            this(name, z4, columns, arrayList);
        }
    }

    public /* synthetic */ TableInfo(String str, Map map, Set set, Set set2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, map, set, (i & 8) != 0 ? null : set2);
    }
}
