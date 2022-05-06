import { ComponentFixture, TestBed } from '@angular/core/testing';

import { AuditoriumForumsComponent } from './auditorium-forums.component';

describe('AuditoriumForumsComponent', () => {
  let component: AuditoriumForumsComponent;
  let fixture: ComponentFixture<AuditoriumForumsComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ AuditoriumForumsComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(AuditoriumForumsComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
