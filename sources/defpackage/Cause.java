package defpackage;

import cj.C1110A;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.Syntax;
import com.squareup.wire.WireField;
import java.util.ArrayList;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.j;
import kotlin.jvm.internal.z;
import okio.ByteString;

/* JADX INFO: loaded from: classes3.dex */
public final class Cause extends Message {
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "humanReadable", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final String human_readable;

    @WireField(adapter = "MemoryError#ADAPTER", jsonName = "memoryError", oneofName = "details", schemaIndex = 1, tag = 2)
    private final MemoryError memory_error;
    public static final C2215s Companion = new C2215s();
    public static final ProtoAdapter<Cause> ADAPTER = new r(FieldEncoding.LENGTH_DELIMITED, z.a(Cause.class), "type.googleapis.com/Cause", Syntax.PROTO_3, null, "tombstone.proto");

    public Cause() {
        this(null, null, null, 7, null);
    }

    public static /* synthetic */ Cause copy$default(Cause cause, String str, MemoryError memoryError, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            str = cause.human_readable;
        }
        if ((i & 2) != 0) {
            memoryError = cause.memory_error;
        }
        if ((i & 4) != 0) {
            byteString = cause.unknownFields();
        }
        return cause.copy(str, memoryError, byteString);
    }

    public final Cause copy(String human_readable, MemoryError memoryError, ByteString unknownFields) {
        j.g(human_readable, "human_readable");
        j.g(unknownFields, "unknownFields");
        return new Cause(human_readable, memoryError, unknownFields);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Cause)) {
            return false;
        }
        Cause cause = (Cause) obj;
        return j.b(unknownFields(), cause.unknownFields()) && j.b(this.human_readable, cause.human_readable) && j.b(this.memory_error, cause.memory_error);
    }

    public final String getHuman_readable() {
        return this.human_readable;
    }

    public final MemoryError getMemory_error() {
        return this.memory_error;
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iC = AbstractC1414e.c(unknownFields().hashCode() * 37, 37, this.human_readable);
        MemoryError memoryError = this.memory_error;
        int iHashCode = iC + (memoryError != null ? memoryError.hashCode() : 0);
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m7newBuilder();
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        AbstractC1414e.p(this.human_readable, new StringBuilder("human_readable="), arrayList);
        if (this.memory_error != null) {
            arrayList.add("memory_error=" + this.memory_error);
        }
        return C1110A.F(arrayList, ", ", "Cause{", "}", null, 56);
    }

    public /* synthetic */ Cause(String str, MemoryError memoryError, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? null : memoryError, (i & 4) != 0 ? ByteString.EMPTY : byteString);
    }

    /* JADX INFO: renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m7newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Cause(String human_readable, MemoryError memoryError, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        j.g(human_readable, "human_readable");
        j.g(unknownFields, "unknownFields");
        this.human_readable = human_readable;
        this.memory_error = memoryError;
    }
}
