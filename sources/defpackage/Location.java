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
public final class Location extends Message {
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", jsonName = "isMock", schemaIndex = 2, tag = 3)
    private final Boolean is_mock;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#DOUBLE", schemaIndex = 0, tag = 1)
    private final Double latitude;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#DOUBLE", schemaIndex = 1, tag = 2)
    private final Double longitude;
    public static final S Companion = new S();
    public static final ProtoAdapter<Location> ADAPTER = new Q(FieldEncoding.LENGTH_DELIMITED, z.a(Location.class), "type.googleapis.com/Location", Syntax.PROTO_3, null, "dde-protobuf/models/core.proto");

    public Location() {
        this(null, null, null, null, 15, null);
    }

    public static /* synthetic */ Location copy$default(Location location, Double d10, Double d11, Boolean bool, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            d10 = location.latitude;
        }
        if ((i & 2) != 0) {
            d11 = location.longitude;
        }
        if ((i & 4) != 0) {
            bool = location.is_mock;
        }
        if ((i & 8) != 0) {
            byteString = location.unknownFields();
        }
        return location.copy(d10, d11, bool, byteString);
    }

    public final Location copy(Double d10, Double d11, Boolean bool, ByteString unknownFields) {
        j.g(unknownFields, "unknownFields");
        return new Location(d10, d11, bool, unknownFields);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Location)) {
            return false;
        }
        Location location = (Location) obj;
        return j.b(unknownFields(), location.unknownFields()) && j.a(this.latitude, location.latitude) && j.a(this.longitude, location.longitude) && j.b(this.is_mock, location.is_mock);
    }

    public final Double getLatitude() {
        return this.latitude;
    }

    public final Double getLongitude() {
        return this.longitude;
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = unknownFields().hashCode() * 37;
        Double d10 = this.latitude;
        int iHashCode2 = (iHashCode + (d10 != null ? d10.hashCode() : 0)) * 37;
        Double d11 = this.longitude;
        int iHashCode3 = (iHashCode2 + (d11 != null ? d11.hashCode() : 0)) * 37;
        Boolean bool = this.is_mock;
        int iHashCode4 = iHashCode3 + (bool != null ? bool.hashCode() : 0);
        this.hashCode = iHashCode4;
        return iHashCode4;
    }

    public final Boolean is_mock() {
        return this.is_mock;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m19newBuilder();
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        if (this.latitude != null) {
            arrayList.add("latitude=" + this.latitude);
        }
        if (this.longitude != null) {
            arrayList.add("longitude=" + this.longitude);
        }
        if (this.is_mock != null) {
            AbstractC1414e.q(new StringBuilder("is_mock="), this.is_mock, arrayList);
        }
        return C1110A.F(arrayList, ", ", "Location{", "}", null, 56);
    }

    public /* synthetic */ Location(Double d10, Double d11, Boolean bool, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : d10, (i & 2) != 0 ? null : d11, (i & 4) != 0 ? null : bool, (i & 8) != 0 ? ByteString.EMPTY : byteString);
    }

    /* JADX INFO: renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m19newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Location(Double d10, Double d11, Boolean bool, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        j.g(unknownFields, "unknownFields");
        this.latitude = d10;
        this.longitude = d11;
        this.is_mock = bool;
    }
}
