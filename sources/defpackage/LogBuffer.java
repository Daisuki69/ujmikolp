package defpackage;

import cj.C1110A;
import cj.C1112C;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.Syntax;
import com.squareup.wire.WireField;
import com.squareup.wire.internal.Internal;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.j;
import kotlin.jvm.internal.z;
import okio.ByteString;

/* JADX INFO: loaded from: classes5.dex */
public final class LogBuffer extends Message {
    private static final long serialVersionUID = 0;

    @WireField(adapter = "LogMessage#ADAPTER", label = WireField.Label.REPEATED, schemaIndex = 1, tag = 2)
    private final List<LogMessage> logs;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final String name;
    public static final U Companion = new U();
    public static final ProtoAdapter<LogBuffer> ADAPTER = new T(FieldEncoding.LENGTH_DELIMITED, z.a(LogBuffer.class), "type.googleapis.com/LogBuffer", Syntax.PROTO_3, null, "tombstone.proto");

    public LogBuffer() {
        this(null, null, null, 7, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ LogBuffer copy$default(LogBuffer logBuffer, String str, List list, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            str = logBuffer.name;
        }
        if ((i & 2) != 0) {
            list = logBuffer.logs;
        }
        if ((i & 4) != 0) {
            byteString = logBuffer.unknownFields();
        }
        return logBuffer.copy(str, list, byteString);
    }

    public final LogBuffer copy(String name, List<LogMessage> logs, ByteString unknownFields) {
        j.g(name, "name");
        j.g(logs, "logs");
        j.g(unknownFields, "unknownFields");
        return new LogBuffer(name, logs, unknownFields);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof LogBuffer)) {
            return false;
        }
        LogBuffer logBuffer = (LogBuffer) obj;
        return j.b(unknownFields(), logBuffer.unknownFields()) && j.b(this.name, logBuffer.name) && j.b(this.logs, logBuffer.logs);
    }

    public final List<LogMessage> getLogs() {
        return this.logs;
    }

    public final String getName() {
        return this.name;
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = this.logs.hashCode() + AbstractC1414e.c(unknownFields().hashCode() * 37, 37, this.name);
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m20newBuilder();
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        AbstractC1414e.p(this.name, new StringBuilder("name="), arrayList);
        if (!this.logs.isEmpty()) {
            AbstractC1414e.s(new StringBuilder("logs="), this.logs, arrayList);
        }
        return C1110A.F(arrayList, ", ", "LogBuffer{", "}", null, 56);
    }

    public LogBuffer(String str, List list, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? C1112C.f9377a : list, (i & 4) != 0 ? ByteString.EMPTY : byteString);
    }

    /* JADX INFO: renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m20newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LogBuffer(String name, List<LogMessage> logs, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        j.g(name, "name");
        j.g(logs, "logs");
        j.g(unknownFields, "unknownFields");
        this.name = name;
        this.logs = Internal.immutableCopyOf("logs", logs);
    }
}
