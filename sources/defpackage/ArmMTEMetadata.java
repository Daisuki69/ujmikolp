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

/* JADX INFO: loaded from: classes.dex */
public final class ArmMTEMetadata extends Message {
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BYTES", jsonName = "memoryTags", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final ByteString memory_tags;
    public static final C1320d Companion = new C1320d();
    public static final ProtoAdapter<ArmMTEMetadata> ADAPTER = new C1051c(FieldEncoding.LENGTH_DELIMITED, z.a(ArmMTEMetadata.class), "type.googleapis.com/ArmMTEMetadata", Syntax.PROTO_3, null, "tombstone.proto");

    /* JADX WARN: Multi-variable type inference failed */
    public ArmMTEMetadata() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ ArmMTEMetadata copy$default(ArmMTEMetadata armMTEMetadata, ByteString byteString, ByteString byteString2, int i, Object obj) {
        if ((i & 1) != 0) {
            byteString = armMTEMetadata.memory_tags;
        }
        if ((i & 2) != 0) {
            byteString2 = armMTEMetadata.unknownFields();
        }
        return armMTEMetadata.copy(byteString, byteString2);
    }

    public final ArmMTEMetadata copy(ByteString memory_tags, ByteString unknownFields) {
        j.g(memory_tags, "memory_tags");
        j.g(unknownFields, "unknownFields");
        return new ArmMTEMetadata(memory_tags, unknownFields);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ArmMTEMetadata)) {
            return false;
        }
        ArmMTEMetadata armMTEMetadata = (ArmMTEMetadata) obj;
        return j.b(unknownFields(), armMTEMetadata.unknownFields()) && j.b(this.memory_tags, armMTEMetadata.memory_tags);
    }

    public final ByteString getMemory_tags() {
        return this.memory_tags;
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = this.memory_tags.hashCode() + (unknownFields().hashCode() * 37);
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m0newBuilder();
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("memory_tags=" + this.memory_tags);
        return C1110A.F(arrayList, ", ", "ArmMTEMetadata{", "}", null, 56);
    }

    public /* synthetic */ ArmMTEMetadata(ByteString byteString, ByteString byteString2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? ByteString.EMPTY : byteString, (i & 2) != 0 ? ByteString.EMPTY : byteString2);
    }

    /* JADX INFO: renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m0newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ArmMTEMetadata(ByteString memory_tags, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        j.g(memory_tags, "memory_tags");
        j.g(unknownFields, "unknownFields");
        this.memory_tags = memory_tags;
    }
}
