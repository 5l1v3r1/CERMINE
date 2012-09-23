package pl.edu.icm.yadda.analysis.metadata.zoneclassification.features;

import pl.edu.icm.yadda.analysis.bibref.parsing.features.AbstractFeatureCalculator;
import pl.edu.icm.yadda.analysis.textr.model.BxZone;
import pl.edu.icm.yadda.analysis.textr.model.BxPage;

public class EmailFeature extends AbstractFeatureCalculator<BxZone, BxPage> {

	@Override
	public double calculateFeatureValue(BxZone object, BxPage context) {
		String text = object.toText();
		text = text.toLowerCase();
		if(text.matches(".*[_a-z0-9-]+(\\.[_a-z0-9-]+)*@[a-z0-9-]+(\\.[a-z0-9-]+)*(\\.[a-z]{2,4}).*")) {
			return 1.0;
		}
		else
			return 0.0;
	}

}
