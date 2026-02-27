package dde.protobuf.fragments;

import cj.C1110A;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.Syntax;
import com.squareup.wire.WireField;
import defpackage.AbstractC1414e;
import dg.Q;
import dg.S;
import java.util.ArrayList;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.j;
import kotlin.jvm.internal.z;
import okio.ByteString;

/* JADX INFO: loaded from: classes4.dex */
public final class Reminder extends Message {
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 2, tag = 3)
    private final String end;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", schemaIndex = 0, tag = 1)
    private final Boolean hasName;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 1, tag = 2)
    private final String start;
    public static final S Companion = new S();
    public static final ProtoAdapter<Reminder> ADAPTER = new Q(FieldEncoding.LENGTH_DELIMITED, z.a(Reminder.class), "type.googleapis.com/dde.protobuf.fragments.Reminder", Syntax.PROTO_3, null, "dde-protobuf/fragments/Reminder.proto");

    public Reminder() {
        this(null, null, null, null, 15, null);
    }

    public static /* synthetic */ Reminder copy$default(Reminder reminder, Boolean bool, String str, String str2, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            bool = reminder.hasName;
        }
        if ((i & 2) != 0) {
            str = reminder.start;
        }
        if ((i & 4) != 0) {
            str2 = reminder.end;
        }
        if ((i & 8) != 0) {
            byteString = reminder.unknownFields();
        }
        return reminder.copy(bool, str, str2, byteString);
    }

    public final Reminder copy(Boolean bool, String str, String str2, ByteString unknownFields) {
        j.g(unknownFields, "unknownFields");
        return new Reminder(bool, str, str2, unknownFields);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Reminder)) {
            return false;
        }
        Reminder reminder = (Reminder) obj;
        return j.b(unknownFields(), reminder.unknownFields()) && j.b(this.hasName, reminder.hasName) && j.b(this.start, reminder.start) && j.b(this.end, reminder.end);
    }

    public final String getEnd() {
        return this.end;
    }

    public final Boolean getHasName() {
        return this.hasName;
    }

    public final String getStart() {
        return this.start;
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = unknownFields().hashCode() * 37;
        Boolean bool = this.hasName;
        int iHashCode2 = (iHashCode + (bool != null ? bool.hashCode() : 0)) * 37;
        String str = this.start;
        int iHashCode3 = (iHashCode2 + (str != null ? str.hashCode() : 0)) * 37;
        String str2 = this.end;
        int iHashCode4 = iHashCode3 + (str2 != null ? str2.hashCode() : 0);
        this.hashCode = iHashCode4;
        return iHashCode4;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m247newBuilder();
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        if (this.hasName != null) {
            AbstractC1414e.q(new StringBuilder("hasName="), this.hasName, arrayList);
        }
        if (this.start != null) {
            AbstractC1414e.p(this.start, new StringBuilder("start="), arrayList);
        }
        if (this.end != null) {
            AbstractC1414e.p(this.end, new StringBuilder("end="), arrayList);
        }
        return C1110A.F(arrayList, ", ", "Reminder{", "}", null, 56);
    }

    public /* synthetic */ Reminder(Boolean bool, String str, String str2, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : bool, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? ByteString.EMPTY : byteString);
    }

    /* JADX INFO: renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m247newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Reminder(Boolean bool, String str, String str2, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        j.g(unknownFields, "unknownFields");
        this.hasName = bool;
        this.start = str;
        this.end = str2;
    }
}
