package dde.protobuf.fragments;

import cj.C1110A;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.Syntax;
import com.squareup.wire.WireField;
import dg.C1373G;
import dg.C1374H;
import java.util.ArrayList;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.j;
import kotlin.jvm.internal.z;
import okio.ByteString;

/* JADX INFO: loaded from: classes4.dex */
public final class LocationFragment extends Message {
    private static final long serialVersionUID = 0;

    @WireField(adapter = "dde.protobuf.fragments.ExtractionDetails#ADAPTER", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final ExtractionDetails extractionDetails;

    @WireField(adapter = "dde.protobuf.fragments.GPS#ADAPTER", schemaIndex = 1, tag = 2)
    private final GPS gps;
    public static final C1374H Companion = new C1374H();
    public static final ProtoAdapter<LocationFragment> ADAPTER = new C1373G(FieldEncoding.LENGTH_DELIMITED, z.a(LocationFragment.class), "type.googleapis.com/dde.protobuf.fragments.LocationFragment", Syntax.PROTO_3, null, "dde-protobuf/fragments/LocationFragment.proto");

    public LocationFragment() {
        this(null, null, null, 7, null);
    }

    public static /* synthetic */ LocationFragment copy$default(LocationFragment locationFragment, ExtractionDetails extractionDetails, GPS gps, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            extractionDetails = locationFragment.extractionDetails;
        }
        if ((i & 2) != 0) {
            gps = locationFragment.gps;
        }
        if ((i & 4) != 0) {
            byteString = locationFragment.unknownFields();
        }
        return locationFragment.copy(extractionDetails, gps, byteString);
    }

    public final LocationFragment copy(ExtractionDetails extractionDetails, GPS gps, ByteString unknownFields) {
        j.g(unknownFields, "unknownFields");
        return new LocationFragment(extractionDetails, gps, unknownFields);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof LocationFragment)) {
            return false;
        }
        LocationFragment locationFragment = (LocationFragment) obj;
        return j.b(unknownFields(), locationFragment.unknownFields()) && j.b(this.extractionDetails, locationFragment.extractionDetails) && j.b(this.gps, locationFragment.gps);
    }

    public final ExtractionDetails getExtractionDetails() {
        return this.extractionDetails;
    }

    public final GPS getGps() {
        return this.gps;
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = unknownFields().hashCode() * 37;
        ExtractionDetails extractionDetails = this.extractionDetails;
        int iHashCode2 = (iHashCode + (extractionDetails != null ? extractionDetails.hashCode() : 0)) * 37;
        GPS gps = this.gps;
        int iHashCode3 = iHashCode2 + (gps != null ? gps.hashCode() : 0);
        this.hashCode = iHashCode3;
        return iHashCode3;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m242newBuilder();
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        if (this.extractionDetails != null) {
            arrayList.add("extractionDetails=" + this.extractionDetails);
        }
        if (this.gps != null) {
            arrayList.add("gps=" + this.gps);
        }
        return C1110A.F(arrayList, ", ", "LocationFragment{", "}", null, 56);
    }

    public /* synthetic */ LocationFragment(ExtractionDetails extractionDetails, GPS gps, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : extractionDetails, (i & 2) != 0 ? null : gps, (i & 4) != 0 ? ByteString.EMPTY : byteString);
    }

    /* JADX INFO: renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m242newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LocationFragment(ExtractionDetails extractionDetails, GPS gps, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        j.g(unknownFields, "unknownFields");
        this.extractionDetails = extractionDetails;
        this.gps = gps;
    }
}
