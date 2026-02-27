package dde.protobuf.fragments;

import cj.C1110A;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.Syntax;
import com.squareup.wire.WireField;
import dg.C1394s;
import dg.C1395t;
import java.util.ArrayList;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.j;
import kotlin.jvm.internal.z;
import okio.ByteString;

/* JADX INFO: loaded from: classes4.dex */
public final class ExtractedFragments extends Message {
    private static final long serialVersionUID = 0;

    @WireField(adapter = "dde.protobuf.fragments.CalendarFragment#ADAPTER", schemaIndex = 9, tag = 10)
    private final CalendarFragment calendar;

    @WireField(adapter = "dde.protobuf.fragments.ContactFragment#ADAPTER", schemaIndex = 10, tag = 11)
    private final ContactFragment contact;

    @WireField(adapter = "dde.protobuf.fragments.DeviceFragment#ADAPTER", schemaIndex = 1, tag = 2)
    private final DeviceFragment device;

    @WireField(adapter = "dde.protobuf.fragments.FontFragment#ADAPTER", schemaIndex = 6, tag = 7)
    private final FontFragment font;

    @WireField(adapter = "dde.protobuf.fragments.HardwareFragment#ADAPTER", schemaIndex = 2, tag = 3)
    private final HardwareFragment hardware;

    @WireField(adapter = "dde.protobuf.fragments.InstalledAppsFragment#ADAPTER", schemaIndex = 8, tag = 9)
    private final InstalledAppsFragment installedApps;

    @WireField(adapter = "dde.protobuf.fragments.LocationFragment#ADAPTER", schemaIndex = 3, tag = 4)
    private final LocationFragment location;

    @WireField(adapter = "dde.protobuf.fragments.MediaFragment#ADAPTER", schemaIndex = 7, tag = 8)
    private final MediaFragment media;

    @WireField(adapter = "dde.protobuf.fragments.MetadataFragment#ADAPTER", schemaIndex = 0, tag = 1)
    private final MetadataFragment metadata;

    @WireField(adapter = "dde.protobuf.fragments.NetworkFragment#ADAPTER", schemaIndex = 5, tag = 6)
    private final NetworkFragment network;

    @WireField(adapter = "dde.protobuf.fragments.RiskIntelligenceFragment#ADAPTER", schemaIndex = 4, tag = 5)
    private final RiskIntelligenceFragment riskIntelligence;

    @WireField(adapter = "dde.protobuf.fragments.ThreatsFragment#ADAPTER", schemaIndex = 11, tag = 12)
    private final ThreatsFragment threats;
    public static final C1395t Companion = new C1395t();
    public static final ProtoAdapter<ExtractedFragments> ADAPTER = new C1394s(FieldEncoding.LENGTH_DELIMITED, z.a(ExtractedFragments.class), "type.googleapis.com/dde.protobuf.fragments.ExtractedFragments", Syntax.PROTO_3, null, "dde-protobuf/ExtractedFragments.proto");

    public ExtractedFragments() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, null, 8191, null);
    }

    public static /* synthetic */ ExtractedFragments copy$default(ExtractedFragments extractedFragments, MetadataFragment metadataFragment, DeviceFragment deviceFragment, HardwareFragment hardwareFragment, LocationFragment locationFragment, RiskIntelligenceFragment riskIntelligenceFragment, NetworkFragment networkFragment, FontFragment fontFragment, MediaFragment mediaFragment, InstalledAppsFragment installedAppsFragment, CalendarFragment calendarFragment, ContactFragment contactFragment, ThreatsFragment threatsFragment, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            metadataFragment = extractedFragments.metadata;
        }
        return extractedFragments.copy(metadataFragment, (i & 2) != 0 ? extractedFragments.device : deviceFragment, (i & 4) != 0 ? extractedFragments.hardware : hardwareFragment, (i & 8) != 0 ? extractedFragments.location : locationFragment, (i & 16) != 0 ? extractedFragments.riskIntelligence : riskIntelligenceFragment, (i & 32) != 0 ? extractedFragments.network : networkFragment, (i & 64) != 0 ? extractedFragments.font : fontFragment, (i & 128) != 0 ? extractedFragments.media : mediaFragment, (i & 256) != 0 ? extractedFragments.installedApps : installedAppsFragment, (i & 512) != 0 ? extractedFragments.calendar : calendarFragment, (i & 1024) != 0 ? extractedFragments.contact : contactFragment, (i & 2048) != 0 ? extractedFragments.threats : threatsFragment, (i & 4096) != 0 ? extractedFragments.unknownFields() : byteString);
    }

    public final ExtractedFragments copy(MetadataFragment metadataFragment, DeviceFragment deviceFragment, HardwareFragment hardwareFragment, LocationFragment locationFragment, RiskIntelligenceFragment riskIntelligenceFragment, NetworkFragment networkFragment, FontFragment fontFragment, MediaFragment mediaFragment, InstalledAppsFragment installedAppsFragment, CalendarFragment calendarFragment, ContactFragment contactFragment, ThreatsFragment threatsFragment, ByteString unknownFields) {
        j.g(unknownFields, "unknownFields");
        return new ExtractedFragments(metadataFragment, deviceFragment, hardwareFragment, locationFragment, riskIntelligenceFragment, networkFragment, fontFragment, mediaFragment, installedAppsFragment, calendarFragment, contactFragment, threatsFragment, unknownFields);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ExtractedFragments)) {
            return false;
        }
        ExtractedFragments extractedFragments = (ExtractedFragments) obj;
        return j.b(unknownFields(), extractedFragments.unknownFields()) && j.b(this.metadata, extractedFragments.metadata) && j.b(this.device, extractedFragments.device) && j.b(this.hardware, extractedFragments.hardware) && j.b(this.location, extractedFragments.location) && j.b(this.riskIntelligence, extractedFragments.riskIntelligence) && j.b(this.network, extractedFragments.network) && j.b(this.font, extractedFragments.font) && j.b(this.media, extractedFragments.media) && j.b(this.installedApps, extractedFragments.installedApps) && j.b(this.calendar, extractedFragments.calendar) && j.b(this.contact, extractedFragments.contact) && j.b(this.threats, extractedFragments.threats);
    }

    public final CalendarFragment getCalendar() {
        return this.calendar;
    }

    public final ContactFragment getContact() {
        return this.contact;
    }

    public final DeviceFragment getDevice() {
        return this.device;
    }

    public final FontFragment getFont() {
        return this.font;
    }

    public final HardwareFragment getHardware() {
        return this.hardware;
    }

    public final InstalledAppsFragment getInstalledApps() {
        return this.installedApps;
    }

    public final LocationFragment getLocation() {
        return this.location;
    }

    public final MediaFragment getMedia() {
        return this.media;
    }

    public final MetadataFragment getMetadata() {
        return this.metadata;
    }

    public final NetworkFragment getNetwork() {
        return this.network;
    }

    public final RiskIntelligenceFragment getRiskIntelligence() {
        return this.riskIntelligence;
    }

    public final ThreatsFragment getThreats() {
        return this.threats;
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = unknownFields().hashCode() * 37;
        MetadataFragment metadataFragment = this.metadata;
        int iHashCode2 = (iHashCode + (metadataFragment != null ? metadataFragment.hashCode() : 0)) * 37;
        DeviceFragment deviceFragment = this.device;
        int iHashCode3 = (iHashCode2 + (deviceFragment != null ? deviceFragment.hashCode() : 0)) * 37;
        HardwareFragment hardwareFragment = this.hardware;
        int iHashCode4 = (iHashCode3 + (hardwareFragment != null ? hardwareFragment.hashCode() : 0)) * 37;
        LocationFragment locationFragment = this.location;
        int iHashCode5 = (iHashCode4 + (locationFragment != null ? locationFragment.hashCode() : 0)) * 37;
        RiskIntelligenceFragment riskIntelligenceFragment = this.riskIntelligence;
        int iHashCode6 = (iHashCode5 + (riskIntelligenceFragment != null ? riskIntelligenceFragment.hashCode() : 0)) * 37;
        NetworkFragment networkFragment = this.network;
        int iHashCode7 = (iHashCode6 + (networkFragment != null ? networkFragment.hashCode() : 0)) * 37;
        FontFragment fontFragment = this.font;
        int iHashCode8 = (iHashCode7 + (fontFragment != null ? fontFragment.hashCode() : 0)) * 37;
        MediaFragment mediaFragment = this.media;
        int iHashCode9 = (iHashCode8 + (mediaFragment != null ? mediaFragment.hashCode() : 0)) * 37;
        InstalledAppsFragment installedAppsFragment = this.installedApps;
        int iHashCode10 = (iHashCode9 + (installedAppsFragment != null ? installedAppsFragment.hashCode() : 0)) * 37;
        CalendarFragment calendarFragment = this.calendar;
        int iHashCode11 = (iHashCode10 + (calendarFragment != null ? calendarFragment.hashCode() : 0)) * 37;
        ContactFragment contactFragment = this.contact;
        int iHashCode12 = (iHashCode11 + (contactFragment != null ? contactFragment.hashCode() : 0)) * 37;
        ThreatsFragment threatsFragment = this.threats;
        int iHashCode13 = iHashCode12 + (threatsFragment != null ? threatsFragment.hashCode() : 0);
        this.hashCode = iHashCode13;
        return iHashCode13;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m235newBuilder();
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        if (this.metadata != null) {
            arrayList.add("metadata=" + this.metadata);
        }
        if (this.device != null) {
            arrayList.add("device=" + this.device);
        }
        if (this.hardware != null) {
            arrayList.add("hardware=" + this.hardware);
        }
        if (this.location != null) {
            arrayList.add("location=" + this.location);
        }
        if (this.riskIntelligence != null) {
            arrayList.add("riskIntelligence=" + this.riskIntelligence);
        }
        if (this.network != null) {
            arrayList.add("network=" + this.network);
        }
        if (this.font != null) {
            arrayList.add("font=" + this.font);
        }
        if (this.media != null) {
            arrayList.add("media=" + this.media);
        }
        if (this.installedApps != null) {
            arrayList.add("installedApps=" + this.installedApps);
        }
        if (this.calendar != null) {
            arrayList.add("calendar=" + this.calendar);
        }
        if (this.contact != null) {
            arrayList.add("contact=" + this.contact);
        }
        if (this.threats != null) {
            arrayList.add("threats=" + this.threats);
        }
        return C1110A.F(arrayList, ", ", "ExtractedFragments{", "}", null, 56);
    }

    public /* synthetic */ ExtractedFragments(MetadataFragment metadataFragment, DeviceFragment deviceFragment, HardwareFragment hardwareFragment, LocationFragment locationFragment, RiskIntelligenceFragment riskIntelligenceFragment, NetworkFragment networkFragment, FontFragment fontFragment, MediaFragment mediaFragment, InstalledAppsFragment installedAppsFragment, CalendarFragment calendarFragment, ContactFragment contactFragment, ThreatsFragment threatsFragment, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : metadataFragment, (i & 2) != 0 ? null : deviceFragment, (i & 4) != 0 ? null : hardwareFragment, (i & 8) != 0 ? null : locationFragment, (i & 16) != 0 ? null : riskIntelligenceFragment, (i & 32) != 0 ? null : networkFragment, (i & 64) != 0 ? null : fontFragment, (i & 128) != 0 ? null : mediaFragment, (i & 256) != 0 ? null : installedAppsFragment, (i & 512) != 0 ? null : calendarFragment, (i & 1024) != 0 ? null : contactFragment, (i & 2048) == 0 ? threatsFragment : null, (i & 4096) != 0 ? ByteString.EMPTY : byteString);
    }

    /* JADX INFO: renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m235newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ExtractedFragments(MetadataFragment metadataFragment, DeviceFragment deviceFragment, HardwareFragment hardwareFragment, LocationFragment locationFragment, RiskIntelligenceFragment riskIntelligenceFragment, NetworkFragment networkFragment, FontFragment fontFragment, MediaFragment mediaFragment, InstalledAppsFragment installedAppsFragment, CalendarFragment calendarFragment, ContactFragment contactFragment, ThreatsFragment threatsFragment, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        j.g(unknownFields, "unknownFields");
        this.metadata = metadataFragment;
        this.device = deviceFragment;
        this.hardware = hardwareFragment;
        this.location = locationFragment;
        this.riskIntelligence = riskIntelligenceFragment;
        this.network = networkFragment;
        this.font = fontFragment;
        this.media = mediaFragment;
        this.installedApps = installedAppsFragment;
        this.calendar = calendarFragment;
        this.contact = contactFragment;
        this.threats = threatsFragment;
    }
}
