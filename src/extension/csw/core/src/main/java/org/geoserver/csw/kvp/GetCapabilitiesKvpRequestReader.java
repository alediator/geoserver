/* Copyright (c) 2001 - 2013 OpenPlans - www.openplans.org. All rights reserved.
 * This code is licensed under the GPL 2.0 license, available at the root
 * application directory.
 */

package org.geoserver.csw.kvp;

import net.opengis.ows10.GetCapabilitiesType;

/**
 * GetCapabilities KVP request reader
 * 
 * @author Andrea Aime, GeoSolutions
 */
public class GetCapabilitiesKvpRequestReader extends CSWKvpRequestReader {
    public GetCapabilitiesKvpRequestReader() {
        super(GetCapabilitiesType.class);
    }

//    @Override
//    @SuppressWarnings("unchecked")
//    public Object read(Object request, Map kvp, Map rawKvp) throws Exception {
//        // make sure we get the right accepts versions param -> workaround for GEOS-1719
//        if(rawKvp.containsKey("acceptVersions")) {
//            OWS11AcceptVersionsKvpParser avp = new OWS11AcceptVersionsKvpParser();
//            AcceptVersionsType avt = (AcceptVersionsType) avp.parse((String) rawKvp.get("acceptVersions"));
//            kvp.put("acceptVersions", avt);
//        }
//        request = super.read(request, kvp, rawKvp);
//
//        return request;
//    }
}
