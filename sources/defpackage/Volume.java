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

/* JADX INFO: loaded from: classes5.dex */
public final class Volume extends Message {
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "availableSize", schemaIndex = 2, tag = 3)
    private final String available_size;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 0, tag = 1)
    private final String description;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", jsonName = "isRemovable", schemaIndex = 3, tag = 4)
    private final Boolean is_removable;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "totalSize", schemaIndex = 1, tag = 2)
    private final String total_size;
    public static final F0 Companion = new F0();
    public static final ProtoAdapter<Volume> ADAPTER = new E0(FieldEncoding.LENGTH_DELIMITED, z.a(Volume.class), "type.googleapis.com/Volume", Syntax.PROTO_3, null, "dde-protobuf/models/core.proto");

    public Volume() {
        this(null, null, null, null, null, 31, null);
    }

    public static /* synthetic */ Volume copy$default(Volume volume, String str, String str2, String str3, Boolean bool, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            str = volume.description;
        }
        if ((i & 2) != 0) {
            str2 = volume.total_size;
        }
        if ((i & 4) != 0) {
            str3 = volume.available_size;
        }
        if ((i & 8) != 0) {
            bool = volume.is_removable;
        }
        if ((i & 16) != 0) {
            byteString = volume.unknownFields();
        }
        ByteString byteString2 = byteString;
        String str4 = str3;
        return volume.copy(str, str2, str4, bool, byteString2);
    }

    public final Volume copy(String str, String str2, String str3, Boolean bool, ByteString unknownFields) {
        j.g(unknownFields, "unknownFields");
        return new Volume(str, str2, str3, bool, unknownFields);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Volume)) {
            return false;
        }
        Volume volume = (Volume) obj;
        return j.b(unknownFields(), volume.unknownFields()) && j.b(this.description, volume.description) && j.b(this.total_size, volume.total_size) && j.b(this.available_size, volume.available_size) && j.b(this.is_removable, volume.is_removable);
    }

    public final String getAvailable_size() {
        return this.available_size;
    }

    public final String getDescription() {
        return this.description;
    }

    public final String getTotal_size() {
        return this.total_size;
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = unknownFields().hashCode() * 37;
        String str = this.description;
        int iHashCode2 = (iHashCode + (str != null ? str.hashCode() : 0)) * 37;
        String str2 = this.total_size;
        int iHashCode3 = (iHashCode2 + (str2 != null ? str2.hashCode() : 0)) * 37;
        String str3 = this.available_size;
        int iHashCode4 = (iHashCode3 + (str3 != null ? str3.hashCode() : 0)) * 37;
        Boolean bool = this.is_removable;
        int iHashCode5 = iHashCode4 + (bool != null ? bool.hashCode() : 0);
        this.hashCode = iHashCode5;
        return iHashCode5;
    }

    public final Boolean is_removable() {
        return this.is_removable;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m36newBuilder();
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        if (this.description != null) {
            AbstractC1414e.p(this.description, new StringBuilder("description="), arrayList);
        }
        if (this.total_size != null) {
            AbstractC1414e.p(this.total_size, new StringBuilder("total_size="), arrayList);
        }
        if (this.available_size != null) {
            AbstractC1414e.p(this.available_size, new StringBuilder("available_size="), arrayList);
        }
        if (this.is_removable != null) {
            AbstractC1414e.q(new StringBuilder("is_removable="), this.is_removable, arrayList);
        }
        return C1110A.F(arrayList, ", ", "Volume{", "}", null, 56);
    }

    public /* synthetic */ Volume(String str, String str2, String str3, Boolean bool, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : bool, (i & 16) != 0 ? ByteString.EMPTY : byteString);
    }

    /* JADX INFO: renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m36newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Volume(String str, String str2, String str3, Boolean bool, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        j.g(unknownFields, "unknownFields");
        this.description = str;
        this.total_size = str2;
        this.available_size = str3;
        this.is_removable = bool;
    }
}
