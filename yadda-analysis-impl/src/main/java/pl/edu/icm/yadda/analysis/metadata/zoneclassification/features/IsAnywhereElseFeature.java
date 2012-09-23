package pl.edu.icm.yadda.analysis.metadata.zoneclassification.features;

import java.util.ArrayList;
import java.util.List;

import pl.edu.icm.yadda.analysis.bibref.parsing.features.AbstractFeatureCalculator;
import pl.edu.icm.yadda.analysis.textr.model.BxPage;
import pl.edu.icm.yadda.analysis.textr.model.BxZone;

public class IsAnywhereElseFeature extends AbstractFeatureCalculator<BxZone, BxPage> {

	@Override
	public double calculateFeatureValue(BxZone object, BxPage context) {
		List<BxPage> pages = getOtherPages(context);
		if(object.toText().length() <= 5) {
			return 0.0;
		}
		for(BxPage page: pages)
			for(BxZone zone: page.getZones()) {
				if(zone.toText().equals(object.toText())) {
					return 1.0;
				}
			}
		return 0.0;
	}
}
