package pl.edu.icm.yadda.analysis.metadata.sampleselection;

import java.util.ArrayList;
import java.util.List;

import pl.edu.icm.yadda.analysis.classification.hmm.training.TrainingElement;

public class NormalSelector<S> implements SampleSelector<S> {

	@Override
	public List<TrainingElement<S>> pickElements(List<TrainingElement<S>> inputElements) {
		return new ArrayList<TrainingElement<S>>(inputElements);
	}

}
