package com.mma.web;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mma.business.Invoice;
import com.mma.business.JsonResponse;
import com.mma.business.LineItem;
import com.mma.db.LineItemRepository;

@RestController
@RequestMapping("/lineitems")
public class LineItemController {

	@Autowired
	private LineItemRepository liRepo;

	@GetMapping("/")
	public JsonResponse getAll() {
		JsonResponse jr = null;
		try {
			jr = JsonResponse.getInstance(liRepo.findAll());
		} catch (Exception e) {
			e.printStackTrace();
			jr = JsonResponse.getInstance(e);
		}
		return jr;
	}

	@GetMapping("/{id}")
	public JsonResponse get(@PathVariable int id) {
		JsonResponse jr = null;
		try {
			Optional<LineItem> li = liRepo.findById(id);
			if (li.isPresent())
				jr = JsonResponse.getInstance(li);
			else
				jr = JsonResponse.getInstance("No invoice found for id: " + id);
		} catch (Exception e) {
			jr = JsonResponse.getInstance(e);
		}
		return jr;
	}

	@PostMapping("/")
	public JsonResponse addLineItem(@RequestBody LineItem li) {
		JsonResponse jr = null;
		// NOTE: May need to enhance exception handling if more than one exception type
		// needs caught
		try {
			jr = JsonResponse.getInstance(liRepo.save(li));
		} catch (Exception e) {
			jr = JsonResponse.getInstance(e);
		}
		return jr;

	}

	@PutMapping("/")
	public JsonResponse updateLineItem(@RequestBody LineItem li) {
		JsonResponse jr = null;
		// NOTE: May need to enhance exception handling if more than one exception type
		// needs caught
		try {
			if (liRepo.existsById(li.getId())) {
				jr = JsonResponse.getInstance(liRepo.save(li));
			} else {
				jr = JsonResponse.getInstance(
						"lineitem id: " + li.getId() + "doesn't exist and " + "you are attempting to save it");
			}
		} catch (Exception e) {
			jr = JsonResponse.getInstance(e);
		}
		return jr;
	}

	@DeleteMapping("/")
	public JsonResponse deleteLineItem(@RequestBody LineItem li) {
		JsonResponse jr = null;
		// NOTE: May need to enhance exception handling if more than one exception type
		// needs caught
		try {
			if (liRepo.existsById(li.getId())) {
				liRepo.delete(li);
				jr = JsonResponse.getInstance("lineitem deleted");
			} else {
				jr = JsonResponse.getInstance(
						"lineitem id: " + li.getId() + "doesn't exist and " + "you are attempting to save it");
			}
		} catch (Exception e) {
			jr = JsonResponse.getInstance(e);
		}
		return jr;
	}
}
