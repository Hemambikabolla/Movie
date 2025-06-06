package com.infy.eventregistration.service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.infy.eventregistration.entity.Asset;
import com.infy.eventregistration.exception.ResourceNotFoundException;
import com.infy.eventregistration.repository.AssetRepository;

import java.util.List;

@Service
@Transactional
public class AssetService {

    private final AssetRepository repository;

    public AssetService(AssetRepository repository) {
        this.repository = repository;
    }

    public List<Asset> getAllAssets() {
        return repository.findAll();
    }

    public Asset getAssetById(String id) {
        return repository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Asset not found with id: " + id));
    }

    public Asset saveAsset(Asset asset) {
        return repository.save(asset);
    }

    public void deleteAsset(String id) {
        Asset asset = getAssetById(id);
        repository.delete(asset);
    }
}
