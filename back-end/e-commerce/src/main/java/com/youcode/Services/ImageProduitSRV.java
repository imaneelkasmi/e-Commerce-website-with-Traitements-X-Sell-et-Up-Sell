package com.youcode.Services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.youcode.DAO.IimageProduitDAO;
import com.youcode.Entiter.ImageProduit;

@Service
public class ImageProduitSRV implements IimageProduitSRV {
	@Autowired IimageProduitDAO imageProduitDAO;

	@Override
	public void addOrUpdateImageProduit(ImageProduit imageProduit) {
		imageProduitDAO.save(imageProduit);
	}

	@Override
	public Optional<ImageProduit> selectByIdImageProduit(int id) {
		System.out.println(imageProduitDAO.findById(id));
		return imageProduitDAO.findById(id);
	}

	@Override
	public List<ImageProduit> selectAllImageProduit() {
		return imageProduitDAO.findAll();
	}

	@Override
	public void deleteImageProduit(int id) {
		imageProduitDAO.deleteById(id);
	}
}
