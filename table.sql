-- asset
INSERT INTO asset (
    id, name, type, status, location, assigned_to, assigned_scene,
    last_maintenance, next_maintenance, notes, barcode
) VALUES (
    'asset-001', 'Red Epic Camera', 'EQUIPMENT', 'CHECKED_OUT', 'Set A', 'Alex Johnson', 'Scene 10',
    '2025-04-01', '2025-07-01', 'Lens calibrated, ready for use.', 'BARC1001'
);

INSERT INTO asset (
    id, name, type, status, location, assigned_to, assigned_scene,
    last_maintenance, next_maintenance, notes, barcode
) VALUES (
    'asset-002', 'Medieval Sword Prop', 'PROP', 'MAINTENANCE', 'Prop Room 2', NULL, NULL,
    '2025-05-10', '2025-06-10', 'Blade chipped, needs repair.', 'BARC1002'
);

INSERT INTO asset (
    id, name, type, status, location, assigned_to, assigned_scene,
    last_maintenance, next_maintenance, notes, barcode
) VALUES (
    'asset-003', 'Police Uniform', 'COSTUME', 'AVAILABLE', 'Wardrobe Rack B', NULL, NULL,
    '2025-04-15', '2025-10-15', 'Cleaned and ironed, ready to wear.', 'BARC1003'
);
INSERT INTO asset (
    id, name, type, status, location, assigned_to, assigned_scene,
    last_maintenance, next_maintenance, notes, barcode
) VALUES (
    'asset-005', 'Ball Gown', 'COSTUME', 'CHECKED_OUT', 'On Set Costume Rack', 'Mia Lopez', 'Scene 22',
    '2025-04-10', '2025-09-10', 'Needs dry cleaning after shoot.', 'BARC1005'
);



-- budget-item

INSERT INTO budget_item (
    id, actual_amount, budget_amount, category, date, description, project_id, status
) VALUES (
    'budget-001', 9500.00, 10000.00, 'Camera Equipment', '2025-05-01',
    'Purchased RED Komodo X with accessories.', 'project-101', 'approved'
);

INSERT INTO budget_item (
    id, actual_amount, budget_amount, category, date, description, project_id, status
) VALUES (
    'budget-002', 3500.00, 4000.00, 'Costume Design', '2025-04-20',
    'Custom outfits for lead actors.', 'project-102', 'pending'
);

INSERT INTO budget_item (
    id, actual_amount, budget_amount, category, date, description, project_id, status
) VALUES (
    'budget-003', 1500.00, 2000.00, 'Transportation', '2025-05-10',
    'Van rental for crew transport.', 'project-103', 'approved'
);

INSERT INTO budget_item (
    id, actual_amount, budget_amount, category, date, description, project_id, status
) VALUES (
    'budget-004', 0.00, 5000.00, 'Location Fees', NULL,
    'Reserved urban location, payment pending.', 'project-104', 'pending'
);

INSERT INTO budget_item (
    id, actual_amount, budget_amount, category, date, description, project_id, status
) VALUES (
    'budget-005', 2200.00, 2500.00, 'Catering', '2025-05-05',
    'Meals and snacks for 3-day shoot.', 'project-105', 'approved'
);



-- cast_crew_member
INSERT INTO cast_crew_member (
    id, email, phone, contract_status, daily_rate, name, role, type
) VALUES (
    'member-001', 'john.doe@example.com', '555-1234', 'SIGNED', 500.00,
    'John Doe', 'Director of Photography', 'CREW'
);

INSERT INTO cast_crew_member (
    id, email, phone, contract_status, daily_rate, name, role, type
) VALUES (
    'member-002', 'emma.watson@example.com', '555-5678', 'SIGNED', 1000.00,
    'Emma Watson', 'Lead Actress', 'CAST'
);

INSERT INTO cast_crew_member (
    id, email, phone, contract_status, daily_rate, name, role, type
) VALUES (
    'member-003', 'alex.lee@example.com', '555-9012', 'PENDING', 300.00,
    'Alex Lee', 'Sound Technician', 'CREW'
);

INSERT INTO cast_crew_member (
    id, email, phone, contract_status, daily_rate, name, role, type
) VALUES (
    'member-004', 'michael.scott@example.com', '555-3456', 'EXPIRED', 200.00,
    'Michael Scott', 'Production Assistant', 'CREW'
);

INSERT INTO cast_crew_member (
    id, email, phone, contract_status, daily_rate, name, role, type
) VALUES (
    'member-005', 'sophia.james@example.com', '555-7890', 'SIGNED', 850.00,
    'Sophia James', 'Supporting Actress', 'CAST'
);



-- locations

INSERT INTO location (id, address, contact_person, cost, name, notes, permit_status) VALUES
('loc001', '123 Main St, Springfield', 'Alice Johnson', 1500.00, 'Warehouse Alpha', 'Near loading dock', 'APPROVED'),
('loc002', '456 Oak Ave, Shelbyville', 'Bob Smith', 1200.50, 'Studio Beta', 'Second floor access', 'PENDING'),
('loc003', '789 Pine Rd, Capital City', 'Carol Lee', 1800.75, 'Office Gamma', 'Parking available', 'APPROVED'),
('loc004', '321 Maple Blvd, Ogdenville', 'David Kim', 1600.00, 'Set Location Delta', 'Close to highway', 'EXPIRED'),
('loc005', '654 Elm St, North Haverbrook', 'Eva Chen', 1400.25, 'Storage Epsilon', 'Temperature controlled', 'APPROVED');



-- messages

INSERT INTO message (id, channel, content, is_read, recipient, sender, subject, timestamp) VALUES
('msg001', 'email', 'Hello, your order has been shipped.', b'0', 'john.doe@example.com', 'sales@shop.com', 'Order Shipped', '2025-06-05 10:15:00.000000'),
('msg002', 'sms', 'Your appointment is confirmed for tomorrow.', b'1', '5551234567', 'clinic@example.com', 'Appointment Confirmation', '2025-06-04 14:30:00.000000'),
('msg003', 'email', 'Please review the attached document.', b'0', 'jane.smith@example.com', 'manager@example.com', 'Document Review', '2025-06-03 09:00:00.000000'),
('msg004', 'chat', 'Are you available for a quick call?', b'1', 'alex@example.com', 'mike@example.com', 'Quick Call', '2025-06-05 11:45:00.000000'),
('msg005', 'email', 'Meeting rescheduled to next week.', b'0', 'team@example.com', 'hr@example.com', 'Meeting Update', '2025-06-02 16:20:00.000000');


-- projects

INSERT INTO project (id, budget, created_date, description, genre, status, timeline, title) VALUES
('proj001', 1500000.00, '2024-12-01', 'A thrilling sci-fi adventure exploring future technology.', 'Science Fiction', 'In Progress', 'Q1 2025 - Q4 2025', 'Future Horizons'),
('proj002', 750000.00, '2023-06-15', 'A heartwarming drama about family bonds.', 'Drama', 'Completed', 'Q2 2023 - Q3 2024', 'Family Ties'),
('proj003', 1200000.00, '2025-01-10', 'A documentary on climate change impacts worldwide.', 'Documentary', 'Pre-Production', 'Q2 2025 - Q1 2026', 'Earth Matters'),
('proj004', 2000000.00, '2024-03-20', 'An action-packed superhero film.', 'Action', 'Post-Production', 'Q4 2024 - Q2 2025', 'Sky Guardian'),
('proj005', 500000.00, '2025-05-01', 'A comedy series about office life.', 'Comedy', 'Planning', 'Q3 2025 - Q1 2026', 'Workplace Woes');


-- schedule items
INSERT INTO schedule_item (id, date, location, notes, project_id, scene, status, time) VALUES
('sched001', '2025-07-01', 'Studio A', 'Initial shooting day, prepare all equipment.', 'proj001', 'Scene 1', 'SCHEDULED', '08:00 AM - 06:00 PM'),
('sched002', '2025-07-03', 'Downtown', 'Outdoor scenes with extras, ensure permits.', 'proj001', 'Scene 5', 'SCHEDULED', '09:00 AM - 05:00 PM'),
('sched003', '2025-07-10', 'Studio B', 'Reshoot for key dialogue scenes.', 'proj002', 'Scene 12', 'IN_PROGRESS', '10:00 AM - 04:00 PM'),
('sched004', '2025-07-15', 'Mountain Location', 'Action sequence shooting, stunt team present.', 'proj004', 'Scene 20', 'SCHEDULED', '07:00 AM - 07:00 PM'),
('sched005', '2025-07-20', 'Studio C', 'Wrap-up and close shots.', 'proj005', 'Scene 30', 'CANCELLED', '08:00 AM - 12:00 PM');


-- task

INSERT INTO task (id, assigned_to, description, due_date, priority, project_id, status, title) VALUES
('task001', 'john.doe@example.com', 'Design initial project wireframes and UI flow.', '2025-06-15', 'HIGH', 'proj001', 'TODO', 'Design Wireframes'),
('task002', 'jane.smith@example.com', 'Develop backend API endpoints for user management.', '2025-06-20', 'MEDIUM', 'proj002', 'IN_PROGRESS', 'API Development'),
('task003', 'michael.brown@example.com', 'Test the payment gateway integration thoroughly.', '2025-06-25', 'HIGH', 'proj001', 'TODO', 'Payment Gateway Testing'),
('task004', 'lisa.jones@example.com', 'Prepare project documentation and user manual.', '2025-07-01', 'LOW', 'proj003', 'TODO', 'Documentation'),
('task005', 'david.wilson@example.com', 'Fix bugs found during QA testing phase.', '2025-06-30', 'HIGH', 'proj002', 'IN_PROGRESS', 'Bug Fixing');
