package dg;

import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import dOYHB6.tiZVw8.numX49;
import dde.protobuf.fragments.CalendarFragment;
import dde.protobuf.fragments.ContactFragment;
import dde.protobuf.fragments.DeviceFragment;
import dde.protobuf.fragments.ExtractedFragments;
import dde.protobuf.fragments.FontFragment;
import dde.protobuf.fragments.HardwareFragment;
import dde.protobuf.fragments.InstalledAppsFragment;
import dde.protobuf.fragments.LocationFragment;
import dde.protobuf.fragments.MediaFragment;
import dde.protobuf.fragments.MetadataFragment;
import dde.protobuf.fragments.NetworkFragment;
import dde.protobuf.fragments.RiskIntelligenceFragment;
import dde.protobuf.fragments.ThreatsFragment;
import java.io.IOException;
import okio.ByteString;

/* JADX INFO: renamed from: dg.s, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C1394s extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) throws IOException {
        kotlin.jvm.internal.j.g(protoReader, numX49.tnTj78("bd5A"));
        long jBeginMessage = protoReader.beginMessage();
        MetadataFragment metadataFragmentDecode = null;
        DeviceFragment deviceFragmentDecode = null;
        HardwareFragment hardwareFragmentDecode = null;
        LocationFragment locationFragmentDecode = null;
        RiskIntelligenceFragment riskIntelligenceFragmentDecode = null;
        NetworkFragment networkFragmentDecode = null;
        FontFragment fontFragmentDecode = null;
        MediaFragment mediaFragmentDecode = null;
        InstalledAppsFragment installedAppsFragmentDecode = null;
        CalendarFragment calendarFragmentDecode = null;
        ContactFragment contactFragmentDecode = null;
        ThreatsFragment threatsFragmentDecode = null;
        while (true) {
            int iNextTag = protoReader.nextTag();
            MetadataFragment metadataFragment = metadataFragmentDecode;
            if (iNextTag == -1) {
                return new ExtractedFragments(metadataFragment, deviceFragmentDecode, hardwareFragmentDecode, locationFragmentDecode, riskIntelligenceFragmentDecode, networkFragmentDecode, fontFragmentDecode, mediaFragmentDecode, installedAppsFragmentDecode, calendarFragmentDecode, contactFragmentDecode, threatsFragmentDecode, protoReader.endMessageAndGetUnknownFields(jBeginMessage));
            }
            switch (iNextTag) {
                case 1:
                    metadataFragmentDecode = MetadataFragment.ADAPTER.decode(protoReader);
                    continue;
                case 2:
                    deviceFragmentDecode = DeviceFragment.ADAPTER.decode(protoReader);
                    break;
                case 3:
                    hardwareFragmentDecode = HardwareFragment.ADAPTER.decode(protoReader);
                    break;
                case 4:
                    locationFragmentDecode = LocationFragment.ADAPTER.decode(protoReader);
                    break;
                case 5:
                    riskIntelligenceFragmentDecode = RiskIntelligenceFragment.ADAPTER.decode(protoReader);
                    break;
                case 6:
                    networkFragmentDecode = NetworkFragment.ADAPTER.decode(protoReader);
                    break;
                case 7:
                    fontFragmentDecode = FontFragment.ADAPTER.decode(protoReader);
                    break;
                case 8:
                    mediaFragmentDecode = MediaFragment.ADAPTER.decode(protoReader);
                    break;
                case 9:
                    installedAppsFragmentDecode = InstalledAppsFragment.ADAPTER.decode(protoReader);
                    break;
                case 10:
                    calendarFragmentDecode = CalendarFragment.ADAPTER.decode(protoReader);
                    break;
                case 11:
                    contactFragmentDecode = ContactFragment.ADAPTER.decode(protoReader);
                    break;
                case 12:
                    threatsFragmentDecode = ThreatsFragment.ADAPTER.decode(protoReader);
                    break;
                default:
                    protoReader.readUnknownField(iNextTag);
                    break;
            }
            metadataFragmentDecode = metadataFragment;
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) throws IOException {
        ExtractedFragments extractedFragments = (ExtractedFragments) obj;
        kotlin.jvm.internal.j.g(protoWriter, numX49.tnTj78("bd5Y"));
        kotlin.jvm.internal.j.g(extractedFragments, numX49.tnTj78("bd5T"));
        MetadataFragment.ADAPTER.encodeWithTag(protoWriter, 1, extractedFragments.getMetadata());
        DeviceFragment.ADAPTER.encodeWithTag(protoWriter, 2, extractedFragments.getDevice());
        HardwareFragment.ADAPTER.encodeWithTag(protoWriter, 3, extractedFragments.getHardware());
        LocationFragment.ADAPTER.encodeWithTag(protoWriter, 4, extractedFragments.getLocation());
        RiskIntelligenceFragment.ADAPTER.encodeWithTag(protoWriter, 5, extractedFragments.getRiskIntelligence());
        NetworkFragment.ADAPTER.encodeWithTag(protoWriter, 6, extractedFragments.getNetwork());
        FontFragment.ADAPTER.encodeWithTag(protoWriter, 7, extractedFragments.getFont());
        MediaFragment.ADAPTER.encodeWithTag(protoWriter, 8, extractedFragments.getMedia());
        InstalledAppsFragment.ADAPTER.encodeWithTag(protoWriter, 9, extractedFragments.getInstalledApps());
        CalendarFragment.ADAPTER.encodeWithTag(protoWriter, 10, extractedFragments.getCalendar());
        ContactFragment.ADAPTER.encodeWithTag(protoWriter, 11, extractedFragments.getContact());
        ThreatsFragment.ADAPTER.encodeWithTag(protoWriter, 12, extractedFragments.getThreats());
        protoWriter.writeBytes(extractedFragments.unknownFields());
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        ExtractedFragments extractedFragments = (ExtractedFragments) obj;
        kotlin.jvm.internal.j.g(extractedFragments, numX49.tnTj78("bd50"));
        return ThreatsFragment.ADAPTER.encodedSizeWithTag(12, extractedFragments.getThreats()) + ContactFragment.ADAPTER.encodedSizeWithTag(11, extractedFragments.getContact()) + CalendarFragment.ADAPTER.encodedSizeWithTag(10, extractedFragments.getCalendar()) + InstalledAppsFragment.ADAPTER.encodedSizeWithTag(9, extractedFragments.getInstalledApps()) + MediaFragment.ADAPTER.encodedSizeWithTag(8, extractedFragments.getMedia()) + FontFragment.ADAPTER.encodedSizeWithTag(7, extractedFragments.getFont()) + NetworkFragment.ADAPTER.encodedSizeWithTag(6, extractedFragments.getNetwork()) + RiskIntelligenceFragment.ADAPTER.encodedSizeWithTag(5, extractedFragments.getRiskIntelligence()) + LocationFragment.ADAPTER.encodedSizeWithTag(4, extractedFragments.getLocation()) + HardwareFragment.ADAPTER.encodedSizeWithTag(3, extractedFragments.getHardware()) + DeviceFragment.ADAPTER.encodedSizeWithTag(2, extractedFragments.getDevice()) + MetadataFragment.ADAPTER.encodedSizeWithTag(1, extractedFragments.getMetadata()) + extractedFragments.unknownFields().size();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        ExtractedFragments extractedFragments = (ExtractedFragments) obj;
        kotlin.jvm.internal.j.g(extractedFragments, numX49.tnTj78("bd5g"));
        MetadataFragment metadata = extractedFragments.getMetadata();
        MetadataFragment metadataFragmentRedact = metadata != null ? MetadataFragment.ADAPTER.redact(metadata) : null;
        DeviceFragment device = extractedFragments.getDevice();
        DeviceFragment deviceFragmentRedact = device != null ? DeviceFragment.ADAPTER.redact(device) : null;
        HardwareFragment hardware = extractedFragments.getHardware();
        HardwareFragment hardwareFragmentRedact = hardware != null ? HardwareFragment.ADAPTER.redact(hardware) : null;
        LocationFragment location = extractedFragments.getLocation();
        LocationFragment locationFragmentRedact = location != null ? LocationFragment.ADAPTER.redact(location) : null;
        RiskIntelligenceFragment riskIntelligence = extractedFragments.getRiskIntelligence();
        RiskIntelligenceFragment riskIntelligenceFragmentRedact = riskIntelligence != null ? RiskIntelligenceFragment.ADAPTER.redact(riskIntelligence) : null;
        NetworkFragment network = extractedFragments.getNetwork();
        NetworkFragment networkFragmentRedact = network != null ? NetworkFragment.ADAPTER.redact(network) : null;
        FontFragment font = extractedFragments.getFont();
        FontFragment fontFragmentRedact = font != null ? FontFragment.ADAPTER.redact(font) : null;
        MediaFragment media = extractedFragments.getMedia();
        MediaFragment mediaFragmentRedact = media != null ? MediaFragment.ADAPTER.redact(media) : null;
        InstalledAppsFragment installedApps = extractedFragments.getInstalledApps();
        InstalledAppsFragment installedAppsFragmentRedact = installedApps != null ? InstalledAppsFragment.ADAPTER.redact(installedApps) : null;
        CalendarFragment calendar = extractedFragments.getCalendar();
        CalendarFragment calendarFragmentRedact = calendar != null ? CalendarFragment.ADAPTER.redact(calendar) : null;
        ContactFragment contact = extractedFragments.getContact();
        ContactFragment contactFragmentRedact = contact != null ? ContactFragment.ADAPTER.redact(contact) : null;
        ThreatsFragment threats = extractedFragments.getThreats();
        return extractedFragments.copy(metadataFragmentRedact, deviceFragmentRedact, hardwareFragmentRedact, locationFragmentRedact, riskIntelligenceFragmentRedact, networkFragmentRedact, fontFragmentRedact, mediaFragmentRedact, installedAppsFragmentRedact, calendarFragmentRedact, contactFragmentRedact, threats != null ? ThreatsFragment.ADAPTER.redact(threats) : null, ByteString.EMPTY);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) throws IOException {
        ExtractedFragments extractedFragments = (ExtractedFragments) obj;
        kotlin.jvm.internal.j.g(reverseProtoWriter, numX49.tnTj78("bd5R"));
        kotlin.jvm.internal.j.g(extractedFragments, numX49.tnTj78("bd5p"));
        reverseProtoWriter.writeBytes(extractedFragments.unknownFields());
        ThreatsFragment.ADAPTER.encodeWithTag(reverseProtoWriter, 12, extractedFragments.getThreats());
        ContactFragment.ADAPTER.encodeWithTag(reverseProtoWriter, 11, extractedFragments.getContact());
        CalendarFragment.ADAPTER.encodeWithTag(reverseProtoWriter, 10, extractedFragments.getCalendar());
        InstalledAppsFragment.ADAPTER.encodeWithTag(reverseProtoWriter, 9, extractedFragments.getInstalledApps());
        MediaFragment.ADAPTER.encodeWithTag(reverseProtoWriter, 8, extractedFragments.getMedia());
        FontFragment.ADAPTER.encodeWithTag(reverseProtoWriter, 7, extractedFragments.getFont());
        NetworkFragment.ADAPTER.encodeWithTag(reverseProtoWriter, 6, extractedFragments.getNetwork());
        RiskIntelligenceFragment.ADAPTER.encodeWithTag(reverseProtoWriter, 5, extractedFragments.getRiskIntelligence());
        LocationFragment.ADAPTER.encodeWithTag(reverseProtoWriter, 4, extractedFragments.getLocation());
        HardwareFragment.ADAPTER.encodeWithTag(reverseProtoWriter, 3, extractedFragments.getHardware());
        DeviceFragment.ADAPTER.encodeWithTag(reverseProtoWriter, 2, extractedFragments.getDevice());
        MetadataFragment.ADAPTER.encodeWithTag(reverseProtoWriter, 1, extractedFragments.getMetadata());
    }
}
