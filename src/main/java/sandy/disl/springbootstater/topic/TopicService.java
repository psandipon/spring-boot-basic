package sandy.disl.springbootstater.topic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TopicService {

	@Autowired
	private TopicRepository topicRepository;

//	private List<Topic> topics = new ArrayList<>(Arrays.asList(new Topic("1", "topic_1", "description_1"),
//			new Topic("2", "topic_2", "description_2"), new Topic("3", "topic_3", "description_3")));

	public List<Topic> getAllTopics() {
//		return topics; 
		List<Topic> topics = new ArrayList<>();
		topicRepository.findAll().forEach(topics::add);
		return topics;
	}

	public Optional<Topic> getTopic(String id) {
		return topicRepository.findById(id);
//		return topics.stream().filter(t -> t.getId().equals(id)).findFirst().get();
	}

	public void addTopic(Topic topic) {
		topicRepository.save( topic);
//		topics.add(topic);
//		return topics;
	}

	public void updateTopic(Topic topic, String id) {
//		for (int i = 0; i < topics.size(); i++) {
//			if (topics.get(i).getId().equals(id)) {
//				topics.set(i, topic);
//				return topics;
//			}
//		}
//		return topics;
		topicRepository.save(topic);
	}

	public void deleteTopic(String id) {
//		for (int i = 0; i < topics.size(); i++) {
//			if (topics.get(i).getId().equals(id)) {
//				topics.remove(i);
//				return topics;
//			}
//		}
//		return topics;
		topicRepository.deleteById(id);

	}

}
