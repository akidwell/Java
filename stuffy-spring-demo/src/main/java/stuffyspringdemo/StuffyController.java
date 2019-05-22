package stuffyspringdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


	
	@Controller
	@RequestMapping("/stuffys")
	public class StuffyController {

		@Autowired
		private StuffyRepository stuffyRepository;
		
		@GetMapping("/all") //get= basic inquires; post= maintenance and security
		public @ResponseBody Iterable<Stuffy> getAllStuffys(){
			return stuffyRepository.findAll();
		}
			
		@PostMapping("/")
		public @ResponseBody String addStuffy(@RequestBody Stuffy stuffy) {
			stuffyRepository.save(stuffy);
			return "Stuffy Saved";
			
		}

}
