package defpackage;

import cj.C1110A;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.Syntax;
import com.squareup.wire.WireField;
import com.squareup.wire.internal.Internal;
import java.util.ArrayList;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.j;
import kotlin.jvm.internal.z;
import okio.ByteString;

/* JADX INFO: loaded from: classes5.dex */
public final class LogMessage extends Message {
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 5, tag = 6)
    private final String message;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#UINT32", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final int pid;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#UINT32", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 3, tag = 4)
    private final int priority;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 4, tag = 5)
    private final String tag;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#UINT32", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 2, tag = 3)
    private final int tid;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final String timestamp;
    public static final W Companion = new W();
    public static final ProtoAdapter<LogMessage> ADAPTER = new V(FieldEncoding.LENGTH_DELIMITED, z.a(LogMessage.class), "type.googleapis.com/LogMessage", Syntax.PROTO_3, null, "tombstone.proto");

    public LogMessage() {
        this(null, 0, 0, 0, null, null, null, 127, null);
    }

    public static /* synthetic */ LogMessage copy$default(LogMessage logMessage, String str, int i, int i4, int i6, String str2, String str3, ByteString byteString, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = logMessage.timestamp;
        }
        if ((i10 & 2) != 0) {
            i = logMessage.pid;
        }
        if ((i10 & 4) != 0) {
            i4 = logMessage.tid;
        }
        if ((i10 & 8) != 0) {
            i6 = logMessage.priority;
        }
        if ((i10 & 16) != 0) {
            str2 = logMessage.tag;
        }
        if ((i10 & 32) != 0) {
            str3 = logMessage.message;
        }
        if ((i10 & 64) != 0) {
            byteString = logMessage.unknownFields();
        }
        String str4 = str3;
        ByteString byteString2 = byteString;
        String str5 = str2;
        int i11 = i4;
        return logMessage.copy(str, i, i11, i6, str5, str4, byteString2);
    }

    public final LogMessage copy(String timestamp, int i, int i4, int i6, String tag, String message, ByteString unknownFields) {
        j.g(timestamp, "timestamp");
        j.g(tag, "tag");
        j.g(message, "message");
        j.g(unknownFields, "unknownFields");
        return new LogMessage(timestamp, i, i4, i6, tag, message, unknownFields);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof LogMessage)) {
            return false;
        }
        LogMessage logMessage = (LogMessage) obj;
        return j.b(unknownFields(), logMessage.unknownFields()) && j.b(this.timestamp, logMessage.timestamp) && this.pid == logMessage.pid && this.tid == logMessage.tid && this.priority == logMessage.priority && j.b(this.tag, logMessage.tag) && j.b(this.message, logMessage.message);
    }

    public final String getMessage() {
        return this.message;
    }

    public final int getPid() {
        return this.pid;
    }

    public final int getPriority() {
        return this.priority;
    }

    public final String getTag() {
        return this.tag;
    }

    public final int getTid() {
        return this.tid;
    }

    public final String getTimestamp() {
        return this.timestamp;
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = this.message.hashCode() + AbstractC1414e.c((((((AbstractC1414e.c(unknownFields().hashCode() * 37, 37, this.timestamp) + this.pid) * 37) + this.tid) * 37) + this.priority) * 37, 37, this.tag);
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m21newBuilder();
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("timestamp=" + Internal.sanitize(this.timestamp));
        arrayList.add("pid=" + this.pid);
        arrayList.add("tid=" + this.tid);
        arrayList.add("priority=" + this.priority);
        arrayList.add("tag=" + Internal.sanitize(this.tag));
        AbstractC1414e.p(this.message, new StringBuilder("message="), arrayList);
        return C1110A.F(arrayList, ", ", "LogMessage{", "}", null, 56);
    }

    public /* synthetic */ LogMessage(String str, int i, int i4, int i6, String str2, String str3, ByteString byteString, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? "" : str, (i10 & 2) != 0 ? 0 : i, (i10 & 4) != 0 ? 0 : i4, (i10 & 8) != 0 ? 0 : i6, (i10 & 16) != 0 ? "" : str2, (i10 & 32) != 0 ? "" : str3, (i10 & 64) != 0 ? ByteString.EMPTY : byteString);
    }

    /* JADX INFO: renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m21newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LogMessage(String timestamp, int i, int i4, int i6, String tag, String message, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        j.g(timestamp, "timestamp");
        j.g(tag, "tag");
        j.g(message, "message");
        j.g(unknownFields, "unknownFields");
        this.timestamp = timestamp;
        this.pid = i;
        this.tid = i4;
        this.priority = i6;
        this.tag = tag;
        this.message = message;
    }
}
